pub trait Summary {
    fn summarize(&self) -> String;

    fn summarize_author(&self) -> String;

    fn default_summarize(&self) -> String {
        format!("(Read more from {}...)", self.summarize_author())
    }
}