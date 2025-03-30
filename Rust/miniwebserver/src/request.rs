use std::net::TcpStream;
use std::io::{BufReader, BufRead, Read};

#[derive(Debug)]
pub struct Request {
    pub method: String,
    pub path: String,
    pub headers: Vec<String>,
}

#[derive(Debug)]
pub enum RequestError {
    MalformedRequest,
    IoError(String),
}

pub fn parse(stream: &TcpStream) -> Result<Request, RequestError> {
    let mut buf_reader = BufReader::new(stream);
    let mut request_line = String::new();

    buf_reader.read_line(&mut request_line)
        .map_err(|e| RequestError::IoError(e.to_string()))?;

    let parts: Vec<&str> = request_line.split_whitespace().collect();
    
    match parts.as_slice() {
        [method, path, "HTTP/1.1"] => Ok(Request {
            method: method.to_string(),
            path: path.to_string(),
            headers: read_headers(&mut buf_reader)?,
        }),
        _ => Err(RequestError::MalformedRequest),
    }
}

fn read_headers<R: Read>(reader: &mut BufReader<R>) -> Result<Vec<String>, RequestError> {
    let mut headers = Vec::new();
    loop {
        let mut header = String::new();
        reader.read_line(&mut header)
            .map_err(|e| RequestError::IoError(e.to_string()))?;
            
        if header.trim().is_empty() {
            break;
        }
        headers.push(header.trim().to_string());
    }
    Ok(headers)
}

impl std::fmt::Display for RequestError {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        match self {
            RequestError::MalformedRequest => write!(f, "Requisição mal formada"),
            RequestError::IoError(msg) => write!(f, "Erro de I/O: {}", msg),
        }
    }
}