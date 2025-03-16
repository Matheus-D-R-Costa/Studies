#![allow(dead_code)]

struct Counter {
    count: u32,
}

impl Counter {
    fn new() -> Self {
        Counter { count: 0 }
    }
}

impl Iterator for Counter {
    type Item = u32;

    fn next(&mut self) -> Option<Self::Item> {
        match self {
            himself if himself.count < 5 => {
                himself.count += 1;
                Some(himself.count)
            }
            _ => None,
        }
    }
}
