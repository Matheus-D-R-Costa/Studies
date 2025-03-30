// src/server.rs
use std::net::{TcpListener, TcpStream};

use crate::thread_pool::ThreadPool;
use crate::request;
use crate::response;
use crate::router;

pub fn start_server(addr: &str, pool_size: usize) {
    let listener = TcpListener::bind(addr).unwrap();
    let pool = ThreadPool::new(pool_size);

    println!("Servidor rodando em http://{}", addr);

    for stream in listener.incoming() {
        match stream {
            Ok(stream) => {
                pool.execute(|| handle_connection(stream));
            }
            Err(e) => eprintln!("Erro na conexão: {}", e),
        }
    }
}

fn handle_connection(mut stream: TcpStream) {
    match request::parse(&stream) {
        Ok(req) => {
            let response = router::route(&req);
            response::send(&mut stream, response);
        }
        Err(e) => {
            eprintln!("Erro na requisição: {}", e);
            response::send(&mut stream, response::error_response(e));
        }
    }
}