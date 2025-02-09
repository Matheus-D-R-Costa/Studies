#[derive(Debug)]
enum UsState {
    Alabama,
    _Alaska,
}

enum Coin {
    _Penny,
    _Nickel,
    _Dime,
    Quarter(UsState),
}

fn main() {
    let coin = Coin::Quarter(UsState::Alabama);
    println!("Your coin value = {}", value_in_cents(coin));

    let five = Some(5);
    let _six = plus_one(five);
    let _none = plus_one(None);

    let dice_rool = 9;
    match dice_rool {
        3 => add_fancy_hat(),
        7 => remove_fancy_hat(),
        _ => (),
    }
}

// fn value_in_cents(coin: Coin) -> u8 {
//     match coin {
//         Coin::_Penny => {
//             println!("Lucky Penny!");
//             1
//         }
//         Coin::_Nickel => 5,
//         Coin::_Dime => 10,
//         Coin::Quarter(state) => {
//             println!("State quarter from {state:?}!");
//             25
//         }
//     }
// }

fn value_in_cents(coin: Coin) -> u8 {
    if let Coin::Quarter(state) = coin {
        println!("State quarter from {:?}!", state);
        25
    } else {
        match coin {
            Coin::_Penny => {
                println!("Lucky Penny!");
                1
            }
            Coin::_Nickel => 5,
            Coin::_Dime => 10,
            _ => 0,
        }
    }
}

fn plus_one(value: Option<i32>) -> Option<i32> {
    match value {
        None => None,
        Some(i) => Some(i + 1),
    }
}

fn add_fancy_hat() {}
fn remove_fancy_hat() {}
