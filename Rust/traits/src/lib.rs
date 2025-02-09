pub mod summary;
pub mod tweet;
pub mod news_article;

use std::fmt::Display;

pub use summary::Summary;
pub use tweet::Tweet;
pub use news_article::NewsArticle;

struct _Pair<T> {
    x: T,
    y: T
}

impl<T: Display + PartialOrd> _Pair<T> {
    fn _cmp_display(&self) {
        if self.x >= self.y {
            println!("The largest member is x = {}", self.x);
        } else {
            println!("The largest member is y = {}", self.y);
        }
    }
}