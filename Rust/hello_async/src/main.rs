use std::env;

use trpl::{Either, Html};

async fn page_title(url: &str) -> (&str, Option<String>) {
    let text = trpl::get(url).await.text().await;
    let title = Html::parse(&text)
        .select_first("title")
        .map(|title| title.inner_html());
    (url, title)
}

// equals code above
// fn page_title(url: &str) -> impl Future<Output = Option<String>> + '_ {
//     async move {
//         let text = trpl::get(url).await.text().await;
//         Html::parse(&text)
//             .select_first("title")
//             .map(|title| title.inner_html())
//     }
// }


fn main() {
    let args: Vec<String> = env::args().collect();
    
    trpl::run(async {
        let title_one = page_title(&args[1]);
        let title_two = page_title(&args[2]);

        let (url, maybe_title) =
            match trpl::race(title_one, title_two).await {
                Either::Left(left) => left,
                Either::Right(right) => right
            };

        println!("{url} returned first");
        match maybe_title {
            Some(title) => println!("Its page is: '{title}'"),
            None => println!("Its title could not be parsed")
        }

    });
    
}