fn main() {
    create_a_horse("Philipe");

    let y = {
        let x = 3;
        x + 1
    };

    println!("The value of y is: {y}");

    let five: u8 = get_five();
    println!("The value of five is {five}");

    let plus = plus_one(20);
    println!("20 more 1 equals = {plus}")

}

fn create_a_horse(name: &str) {
    println!("You named your horse to {name}");
}

fn get_five() -> u8 {
    return 5;
}

fn plus_one(x: i32) -> i32 {
    x + 1
}