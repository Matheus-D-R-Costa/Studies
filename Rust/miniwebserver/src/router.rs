use std::fs;
use crate::request::Request;
use crate::response::Response;

pub fn route(request: &Request) -> Response {
    match (request.method.as_str(), request.path.as_str()) {
        ("GET", "/") => serve_file("hello.html"),
        ("GET", "/sleep") => {
            std::thread::sleep(std::time::Duration::from_secs(5));
            serve_file("hello.html")
        }
        ("GET", path) => serve_file(path),
        _ => Response {
            status_code: 404,
            content: "Página não encontrada".to_string(),
            content_type: "text/plain".to_string(),
        },
    }
}

fn serve_file(path: &str) -> Response {
    let sanitized_path = path.trim_start_matches('/');
    match fs::read_to_string(sanitized_path) {
        Ok(content) => Response {
            status_code: 200,
            content,
            content_type: mime_type(sanitized_path),
        },
        Err(_) => Response {
            status_code: 404,
            content: "Arquivo não encontrado".to_string(),
            content_type: "text/plain".to_string(),
        },
    }
}

fn mime_type(path: &str) -> String {
    match path.split('.').last() {
        Some("html") => "text/html".to_string(),
        Some("css") => "text/css".to_string(),
        Some("js") => "text/javascript".to_string(),
        Some("png") => "image/png".to_string(),
        Some("jpg") | Some("jpeg") => "image/jpeg".to_string(),
        _ => "text/plain".to_string(),
    }
}