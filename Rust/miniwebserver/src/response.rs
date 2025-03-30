use std::net::TcpStream;
use std::io::{Write, Result};

#[derive(Debug)]
pub struct Response {
    pub status_code: u16,
    pub content: String,
    pub content_type: String,
}

pub fn send(stream: &mut TcpStream, response: Response) -> Result<()> {
    let status_line = match response.status_code {
        200 => "HTTP/1.1 200 OK",
        404 => "HTTP/1.1 404 Not Found",
        500 => "HTTP/1.1 500 Internal Server Error",
        _ => "HTTP/1.1 400 Bad Request",
    };

    let response = format!(
        "{}\r\nContent-Type: {}\r\nContent-Length: {}\r\n\r\n{}",
        status_line,
        response.content_type,
        response.content.len(),
        response.content
    );

    stream.write_all(response.as_bytes())
}

pub fn error_response(error: super::request::RequestError) -> Response {
    match error {
        super::request::RequestError::MalformedRequest => Response {
            status_code: 400,
            content: "Requisição mal formada".to_string(),
            content_type: "text/plain".to_string(),
        },
        _ => Response {
            status_code: 500,
            content: "Erro interno do servidor".to_string(),
            content_type: "text/plain".to_string(),
        },
    }
}