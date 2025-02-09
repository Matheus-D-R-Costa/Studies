use std::collections::HashMap;

fn main() {
    let mut scores = HashMap::new();

    scores.insert(String::from("Team 7"), 400);
    scores.insert(String::from("Team 2"), 390);

    let team_name = String::from("Team 7");
    let score = scores.get(&team_name).copied().unwrap_or(0);
    println!("O score do time {team_name} é {score}");

    for (k, v) in &scores {
        println!("{k}: {v}")
    }

    scores.entry(String::from("Team 8")).or_insert(50);
    scores.entry(String::from("Team 7")).or_insert(3);

    println!("{scores:?}");

    let text = "hello world wonderful world";

    let mut words_and_occurencies = HashMap::new();

    for word in text.split_whitespace() {
        let count = words_and_occurencies.entry(word).or_insert(0);
        *count += 1;
    }

    println!("{words_and_occurencies:?}");

    // let field_name = String::from("Favorite color");
    // let field_value = String::from("Blue");

    // let mut map = HashMap::new();
    // map.insert(field_name, field_value);
    // // field_name and field_value are invalid at this point, try using them and
    // // see what compiler error you get!

}
