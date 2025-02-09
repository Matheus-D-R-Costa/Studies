use traits::{NewsArticle, Summary, Tweet};

// fn _notify(item: &(impl Summary + Display)) {
//     println!("!Breaking news! {}", item.default_summarize());
// }

// do same thing as code above
// pub fn notify<T: Summary + Display>(item: &T) {
//     println!("Breaking news! {}", item.summarize());
// }

// fn _some_function<T, U>(t: &T, u: &U) -> i32
// where T: Display + Clone, U: Clone + Debug {

// }

// do same thing as code above
// fn _some_function<T: Display + Clone, U: Clone + Debug>(t: &T, u: &U) -> i32 { }

fn returns_summarizable() -> impl Summary {
    Tweet {
        username: String::from("horse_ebooks"),
        content: String::from("of course, as you probably already know, people"),
        reply: false,
        retweet: false,
    }
}

fn main() {
    let tweet = Tweet {
        username: String::from("horse_ebooks"),
        content: String::from("of course, as you probably already know, people"),
        reply: false,
        retweet: false,
    };

    println!("1 new tweet: {}", tweet.summarize());

    let article = NewsArticle {
        headline: String::from("Penguins win the Stanley Cup Championship!"),
        location: String::from("Pittsburgh, PA, USA"),
        author: String::from("Iceburgh"),
        content: String::from(
            "The Pittsburgh Penguins once again are the best \
             hockey team in the NHL.",
        ),
    };

    println!("New article available! {}", article.default_summarize());
    println!("1 new tweet: {}", tweet.default_summarize());

    let new_summary = returns_summarizable();
    println!("1 new summary: {}", new_summary.summarize());
}
