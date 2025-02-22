use std::{fmt::Display, ops::Deref};

use cons_list::ConsList;


struct MyBox<T>(T);

impl<T> MyBox<T> {
    fn new(data: T) -> MyBox<T> {
        MyBox(data)
    }
}

impl<T> Deref for MyBox<T> {
    type Target = T;

    fn deref(&self) -> &Self::Target {
        &self.0
    }
}

struct CustomSmartPointer<T: Display> {
    data: T
}

impl<T: Display> Drop for CustomSmartPointer<T> {
    fn drop(&mut self) {
        println!("Dropping CustomSmartPointer with data `{}`!", self.data);
    }
}

fn main() {
    let mut list: ConsList<i32> = ConsList::new();
    list.push(1);
    list.push(2);
    list.push(3);

    for v in list.iter() {
        println!("{}", v);
    }

    let x = 5;
    let _y = &x;
    let _z = Box::new(x);
    let a = MyBox::new(x);
    println!("O valor dentro de MyBox é: {}", *a);

    let m = MyBox::new(String::from("Rust"));
    // hello(&(*m)[..]); se String não implementasse o traço Deref
    hello(&m);

    let c = CustomSmartPointer { data: String::from("some stuff") };
    let _d = CustomSmartPointer { data: 500 };

    drop(c);
    println!("CustomSmartPointers created.");

}

fn hello(name: &str) {
    println!("Hello, {name}!");
}
