enum SpreadsheetCell {
    _Int(i32),
    _Float(f64),
    _Text(String)
}

fn main() {
    let mut vctr: Vec<u8> = Vec::new();

    vctr.push(5);
    vctr.push(6);
    vctr.push(7);
    vctr.push(8);

    for i in &mut vctr {
        *i += 50;
    }

    let vctr2 = vec![1, 2, 3, 4, 5];

    for i in &vctr2 {
        println!("{i}");
    }

    let third = &vctr2[2];
    println!("The third element is {third}");

    let third: Option<&i32> = vctr2.get(2);
    match third {
        Some(third) => println!("The third element is {third}"),
        None => println!("There is no third element.")
    }

    let _row = vec![
        SpreadsheetCell::_Int(3),
        SpreadsheetCell::_Text(String::from("blue")),
        SpreadsheetCell::_Float(10.12)
    ];

}
