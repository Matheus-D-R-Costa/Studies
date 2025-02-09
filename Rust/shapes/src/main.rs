#[derive(Debug)]
struct Rectangle {
    width: u32,
    height: u32,
}

impl Rectangle {
    fn new(width: u32, height: u32) -> Self {
        Self { width, height }
    }

    // fn square(size: u32) -> Self {
    //     Self {
    //         width: size,
    //         height: size,
    //     }
    // }

    fn width(&self) -> bool {
        self.width > 0
    }

    fn area(&self) -> u32 {
        self.width * self.height
    }

    fn can_hold(&self, another: &Rectangle) -> bool {
        self.width > another.width && self.height > another.height
    }
}

fn main() {
    let scale = 2;
    let rect1 = Rectangle::new(dbg!(30 * scale), 50);

    println!("rect1 is {rect1:#?}");
    dbg!(&rect1);

    println!(
        "The area of the rectangle is {} square pixels.",
        rect1.area()
    );

    if rect1.width() {
        println!("The rectangle has a nonzero width; it is {}", rect1.width);
    }

    let rect2 = Rectangle::new(10, 40);
    println!("Can rect1 hold rect2? {}", rect1.can_hold(&rect2));

    let rect3 = Rectangle::new(60, 45);
    println!("Can rect1 hold rect3? {}", rect1.can_hold(&rect3));
}
