fn main() {
    let str = "cavalo";
    let len = calculate_lenght(&str);
    println!("The length of '{str}' is {len}.");

    let mut str2 = String::from("hello");
    change(&mut str2);
    println!("{str2}");
}

fn calculate_lenght(str: &&str) -> usize {
    return str.len();
}

fn change(str: &mut String) {
    str.push_str(", world!");
}
