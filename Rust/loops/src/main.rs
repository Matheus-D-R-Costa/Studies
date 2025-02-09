fn loop_example_one() {
    let mut counter: u8 = 0;

    let result = loop {
        counter += 1;

        if counter == 10 {
            break counter * 2;
        }
    };

    println!("The result is {result}");
}

fn loop_example_two() {
    let mut count = 0;
    'couting_up: loop {
        println!("count = {count}");
        let mut remaining = 10;

        loop {
            println!("remaining = {remaining}");
            if remaining == 9 {
                break;
            }
            if count == 2 {
                break 'couting_up;
            }
            remaining -= 1;
        }
        count += 1;
    }
    println!("End count = {count}");
}

fn while_example_one() {
    let mut number = 3;

    while number != 0 {
        println!("{number}");
        number -= 1;
    }
    println!("LIFTOOF!!!");
}

fn while_example_two() {
    const A: [u8; 5] = [10, 20, 30, 40, 50];
    let mut index = 0;

    while index < 5 {
        println!("the value is: {}", A[index]);

        index += 1;
    }

}

fn for_example_one() {
    const A: [u8; 5] = [10, 20, 30, 40, 50];

    for element in A {
        println!("The value is : {element}")
    }
}

fn for_example_two() {
    for number in (1..4).rev() {
        println!("{number}!");
    }
    println!("LIFTOFF!!!");
}

fn main() {
    loop_example_one();
    loop_example_two();
    while_example_one();
    while_example_two();
    for_example_one();
    for_example_two();
}
