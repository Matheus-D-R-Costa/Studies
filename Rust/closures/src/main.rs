use std::{thread, time::Duration};

#[derive(Debug, PartialEq, Copy, Clone)]

enum ShirtColor {
    Red,

    Blue,
}

struct Inventory {
    shirts: Vec<ShirtColor>,
}

impl Inventory {
    fn giveaway(&self, user_preference: Option<ShirtColor>) -> ShirtColor {
        user_preference.unwrap_or_else(|| self.most_stocked())
    }

    fn most_stocked(&self) -> ShirtColor {
        let mut num_red = 0;

        let mut num_blue = 0;

        for color in &self.shirts {
            match color {
                ShirtColor::Red => num_red += 1,

                ShirtColor::Blue => num_blue += 1,
            }
        }

        match num_red > num_blue {
            true => ShirtColor::Red,

            false => ShirtColor::Blue,
        }
    }
}

#[derive(Debug)]

struct Rectangle {
    width: u32,

    _height: u32,
}

fn main() {
    let _expensive_clousure = |num: u32| -> u32 {
        println!("Calculating slowly...");

        thread::sleep(Duration::from_secs(2));

        num
    };

    let closure = |num| {
        println!("Calculating slowly...");

        thread::sleep(Duration::from_secs(2));

        num
    };

    let _s = closure(String::from("hello"));

    let store = Inventory {
        shirts: vec![ShirtColor::Blue, ShirtColor::Red, ShirtColor::Blue],
    };

    let user_pref1 = Some(ShirtColor::Red);

    let giveaway1 = store.giveaway(user_pref1);

    println!(
        "The user with preference {:?} gets {:?}",
        user_pref1, giveaway1
    );

    let user_pref2 = None;

    let giveaway2 = store.giveaway(user_pref2);

    println!(
        "The user with preference {:?} gets {:?}",
        user_pref2, giveaway2
    );

    let list = vec![1, 2, 3];

    println!("Before defining closure: {list:?}");

    let only_borrows = || println!("From closure: {list:?}");

    println!("Before calling closure: {list:?}");

    only_borrows();

    println!("After calling closure: {list:?}");

    let mut list = vec![1, 2, 3];

    println!("Before defining closure: {list:?}");

    let mut borrows_mutably = || list.push(7);

    borrows_mutably();

    println!("After calling closure: {list:?}");

    let list = vec![1, 2, 3];

    println!("Before defining closure: {list:?}");

    thread::spawn(move || println!("From thread: {list:?}"))
        .join()
        .unwrap();

    let mut list = [
        Rectangle {
            width: 10,
            _height: 1,
        },
        Rectangle {
            width: 3,
            _height: 5,
        },
        Rectangle {
            width: 7,
            _height: 12,
        },
    ];

    let mut num_sort_operations = 0;

    list.sort_by_key(|r| {
        num_sort_operations += 1;

        r.width
    });

    println!("{list:#?}, sorted in {num_sort_operations} operations");
}

// fn  add_one_v1   (x: u32) -> u32 { x + 1 }

// let add_one_v2 = |x: u32| -> u32 { x + 1 };

// let add_one_v3 = |x|             { x + 1 };

// let add_one_v4 = |x|               x + 1  ;
