use std::fmt::Display;


struct ImportantExcerpt<'a> {
    _part: &'a str,
}

fn longest<'a>(x: &'a str, y: &'a str) -> &'a str {
    if x.len() > y.len() {
        x
    } else {
        y
    }
}

fn _longest_with_announcement<'a, T: Display>(x: &'a str, y: &'a str, ann: T) -> &'a str {
    println!("announcement! {ann}");
    if x.len() > y.len() {
        return x;
    }

    y

}

fn main() {
    let string1 = String::from("long string is long");

    {
        let string2 = String::from("xyz");
        let result = longest(string1.as_str(), string2.as_str());
        println!("The longest string is {result}");

    }

    let novel = String::from("Call me Ishmael. Some years ago...");
    let first_sentence = novel.split(".")
        .next()
        .expect("Not found '.'");
    let _i = ImportantExcerpt { _part: first_sentence };

    let _s: &'static str = "I have a static lifetime and now INFINITE!!.";
}
