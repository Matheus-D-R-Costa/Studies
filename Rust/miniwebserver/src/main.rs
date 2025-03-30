mod server;
mod thread_pool;
mod request;
mod response;
mod router;

use server::start_server;

fn main() {
    start_server("127.0.0.1:7878", 4)
}
