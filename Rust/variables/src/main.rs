fn main() {
    let mut x: i8 = 5;
    println!("The value of x is {x}");
    x = 6;
    println!("The vaule of x is {x}");

    let y: i8 = 5;
    let y: i8 = y + 1;

    {
        let y: i8 = y * 2;
        println!("The value of y in the inner scope is: {y}");
    }

    println!("The value of y is: {y}");

    const THREE_HOURS_IN_SECONDS: u32 = 60 * 60 * 3;
    println!("three hours in seconds = {THREE_HOURS_IN_SECONDS}");

    let spaces = "    ";
    let spaces = spaces.len();
    println!("space of space is {spaces} (lol)");

    const TUP: (i32, f64, u8) = (500, 6.4, 1);
    println!("Getting the values inside const TUP {0}, {1}, {2} ", TUP.0, TUP.1, TUP.2);
    
    let _tup = (500, 6.4, 1);
    let (x, y, z) = _tup;
    println!("the value of x is {x}, y is {y}, and z is {z}");

    const MONTHS: [&str; 12] = ["January", "February", "March", "April", "May", "June", "July",
    "August", "September", "October", "November", "December"];
    println!("I was born in {0}", MONTHS[4]);

    let _five_three = [3; 5]; // equals [3, 3, 3, 3, 3]

}
