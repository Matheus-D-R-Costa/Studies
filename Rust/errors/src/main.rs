use std::fs::{self, File};
use std::io::{self, Read as _};

fn main() {
    // let v = vec![1, 2, 3];
    // v[99]; // throw a panic!

    // let file = File::open("hello.txt");
    // let _file = match file {
    //     Ok(value_on_file) => value_on_file,
    //     Err(error) => match error.kind() {
    //         ErrorKind::NotFound => match File::create("hello.txt") {
    //             Ok(fc) => fc,
    //             Err(e) => panic!("Problem creating the file: {e:?}"),
    //         },
    //         _other_error => {
    //             panic!("Problem opening the file: {error:?}");
    //         }
    //     },
    // };

    // // same logic as method above
    // let _file2 = File::open("hello2.txt").unwrap_or_else(|error| -> File {
    //     if error.kind() == ErrorKind::NotFound {
    //         File::create("hello2.txt").unwrap_or_else(|error| {
    //             panic!("Problem creating the file: {error:?}");
    //         })
    //     } else {
    //         panic!("Problem opening the file: {error:?}");
    //     }
    // });

    // let gretting_file = File::open("hello.txt").unwrap();

    let _gretting_file = File::open("hello.txt")
        .expect("hello.txt should be included in this project");

}

fn _read_username_from_file() -> Result<String, io::Error> {
    let username_file_result = File::open("hello.txt");

    let mut username_file = match username_file_result {
        Ok(file) => file,
        Err(e) => return Err(e),
    };

    let mut username = String::new();

    match username_file.read_to_string(&mut username) {
        Ok(_) => Ok(username),
        Err(e) => Err(e),
    }
}

fn _read_username_from_file_refactored() -> Result<String, io::Error> {
    let mut username_file = File::open("hello.txt")?;
    let mut username = String::new();
    username_file.read_to_string(&mut username)?;
    Ok(username)
}

fn _read_username_from_file_refactored2() -> Result<String, io::Error> {
    let mut username = String::new();
    File::open("hello.txt")?.read_to_string(&mut username)?;
    Ok(username)
}

fn _read_username_from_file_refactored3() -> Result<String, io::Error> {
    fs::read_to_string("hello.txt")
}

fn _last_char_of_first_line(text: &str) -> Option<char> {
    text.lines().next()?.chars().last()
}
