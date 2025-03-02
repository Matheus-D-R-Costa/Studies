use gui::{Button, Draw, Screen};

struct SelectButtom {
    width: u32,
    height: u32,
    options: Vec<String>,
}

impl Draw for SelectButtom {
    fn draw(&self) {
        println!("Drawning using the select buttom...");
    }
}

fn main() {
    let screen = Screen {
        components: vec![
            Box::new(SelectButtom {
                width: 75,
                height: 10,
                options: vec![
                    String::from("yes"),
                    String::from("Maybe"),
                    String::from("No"),
                ],
            }),
            Box::new(Button {
                width: 50,
                height: 10,
                label: String::from("OK"),
            }),
        ],
    };

    screen.run();
}
