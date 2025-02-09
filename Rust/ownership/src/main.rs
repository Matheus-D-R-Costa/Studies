fn main() {
    let x = 5;
    let y = x;
    println!("The value of x is {x} and y is {y}");

    let s1 = String::from("hello");
    let s2 = s1;
    println!("{s2} world!");

    let s3 = String::from("arroy");
    let s4 = s3.clone();
    println!("s3 = {s3}, s4 = {s4}");

    let some_string = String::from("horse");
    takes_ownership(some_string);

    let some_integer = 364;
    makes_copy(some_integer);

    let s5 = gives_ownership();
    println!("s5 = {s5}");

    let s6 = String::from("What happens in 1971?");
    let s7 = takes_and_gives_back(s6);
    println!("{s7}");
}

fn takes_ownership(some_string: String) {
    println!("{some_string}");
}

fn makes_copy(some_integer: i32) {
    println!("{some_integer}");
}

fn gives_ownership() -> String {
    let some_string = String::from("yours");
    some_string
}

fn takes_and_gives_back(a_string: String) -> String {
    a_string
}
