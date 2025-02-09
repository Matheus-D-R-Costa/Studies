// struct Ipv4Addr {
//     // --snip--
// }

// struct Ipv6Addr {
//     // --snip--
// }

// enum IpAddr {
//     V4(Ipv4Addr),
//     V6(Ipv6Addr),
// }

enum Message {
    Quit,
    Move { x: i32, y: i32 },
    Write(String),
    ChangeColor(i32, i32, i32),
}

impl Message {
    fn call(&self) {
        match self {
            Message::Quit => {
                println!("Quit");
            }
            Message::Move { x, y } => {
                println!("Move to x: {}, y: {}", x, y);
            }
            Message::Write(text) => {
                println!("Writing: {}", text);
            }
            Message::ChangeColor(r, g, b) => {
                println!("Change color to red: {}, green: {}, blue: {}", r, g, b);
            }
        }
    }
}

fn main() {
    let msg = Message::Write(String::from("fizz"));
    msg.call();

    let msg = Message::Quit;
    msg.call();

    let msg = Message::Move { x: 10, y: 20 };
    msg.call();

    let msg = Message::ChangeColor(255, 0, 0);
    msg.call();
}
