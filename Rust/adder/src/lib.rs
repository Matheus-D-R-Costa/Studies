fn add(left: u64, right: u64) -> u64 {
    left + right
}

#[derive(Debug)]
struct Rectangle {
    width: u32,
    height: u32,
}

impl Rectangle {
    fn can_hold(&self, other: &Rectangle) -> bool {
        self.width > other.width && self.height > other.height
    }
}

pub fn greeting(name: &str) -> String {
    format!("Hello {name}!")
}

pub struct Guess {
    value: i32,
}

impl Guess {
    pub fn new(value: i32) -> Guess {
        if value < 1 {
            panic!(
                "Guess value must be greater than or equal to 1, got {value}."
            );
        } else if value > 100 {
            panic!(
                "Guess value must be less than or equal to 100, got {value}."
            );
        }

        Guess { value }
    }
}

#[cfg(test)]
mod tests {
    use std::result;

    use super::*;

    #[test]
    fn it_works() {
        let result = add(2, 2);
        assert_eq!(result, 4);
    }

    #[test]
    fn should_larger_hold_smaller() {
        let larger = Rectangle { width: 8, height: 7 };
        let smaller: Rectangle = Rectangle { width: 5, height: 1 };
        assert!(larger.can_hold(&smaller));
    }

    #[test]
    #[ignore]
    fn should_smaller_not_hold_larger() {
        let larger = Rectangle { width: 8, height: 7 };
        let smaller: Rectangle = Rectangle { width: 5, height: 1 };
        assert!(!smaller.can_hold(&larger));
    }

    #[test]
    fn it_should_contains_name() {
        let result = greeting("carol");
        assert!(result.contains("carol"), "Greeting did not contain name, value was `{result}`");
    }

    #[test]
    #[should_panic(expected = "less than or equal to 100")]
    fn greater_than_100() {
        Guess::new(200);
    }

}
