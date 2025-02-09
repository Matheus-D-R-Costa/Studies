struct Point<T> {
    x: T,
    y: T
}

impl Point<f32> {
    fn distance_from_origin(&self) -> f32 {
        (self.x.powi(2) + self.y.powi(2)).sqrt()
    }
}

struct AnotherPointer<X1, Y1> {
    x: X1,
    _y: Y1
}

impl<X1, Y1> AnotherPointer<X1, Y1> {
    fn mixup<X2, Y2>(self, other: AnotherPointer<X2, Y2>) -> AnotherPointer<X1, Y2> {
        AnotherPointer {
            x: self.x,
            _y: other._y
        }
    }
    
    fn x(&self) -> &X1 {
        &self.x
    }
}

fn get_largest<T: std::cmp::PartialOrd>(list: &[T]) -> &T {
    let mut largest = &list[0];

    for item in list {
        if item > largest {
            largest = item;
        }
    }

    largest
}

fn main() {
    let float: Point<f32> = Point { x: 1.0, y: 4.0 };
    println!("float.x = {}", float.x);
    println!("distance from origin = {}", float.distance_from_origin());

    let anp1 = AnotherPointer { x: 5, _y: 10.4 };
    let anp2 = AnotherPointer { x: "Hello", _y: 'c' };

    let anp3 = anp1.mixup(anp2);
    println!("anp3.x = {}, anp3.y = {}", anp3.x, anp3._y);

    let interger_and_float = AnotherPointer{ x: 5, _y: 4.0 };
    println!("interger_and_float.x = {}", interger_and_float.x());


    let number_list = vec![34, 50, 25, 100, 65];

    let result = get_largest(&number_list);
    println!("The largest number is {result}");

    let char_list = vec!['y', 'm', 'a', 'q'];

    let result = get_largest(&char_list);
    println!("The largest char is {result}");
}
