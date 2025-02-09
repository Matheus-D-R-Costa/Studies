fn main() {
    let fizz = "hello world";

    let hello = &fizz[0..5];
    let world = &fizz[6..11];
    println!("{hello} {world}!");

    let slice = &fizz[..];
    println!("{slice}!");

    let first_word = get_first_word(fizz);
    println!("First word of let fizz = {first_word}");

    let buzz = String::from("Fizz buzz");
    println!("{}", get_first_word(&buzz[..]));
}

fn get_first_word(string: &str) -> &str {
    let bytes = string.as_bytes();

    for (i, &item) in bytes.iter().enumerate() {
        if item == b' ' {
            return &string[0..i];
        }
    }

    return &string[..];
}
