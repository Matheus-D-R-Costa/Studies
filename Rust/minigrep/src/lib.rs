use std::{ env, error::Error, fs };

pub struct Config<'a> {
    pub query: &'a str,
    file_path: &'a str,
    ignore_case: bool
}

impl<'a> Config<'a>{
    fn new(query: &'a str, file_path: &'a str, ignore_case: bool) -> Self {
        Self {query, file_path, ignore_case }
    }
}

pub fn parse_config(args: &[String]) -> Result<Config, &'static str> {
    if args.len() < 3 {  return Err("not enough arguments") }
    let ignore_case = env::var("IGNORE_CASE").is_ok();
    Ok(Config::new(&args[1], &args[2], ignore_case))
}

pub fn run(config: Config) -> Result<(), Box<dyn Error>> {
    let contents = fs::read_to_string(config.file_path)?;

    let results = match config.ignore_case {
        true => search_case_insensitive(config.query, &contents),
        false => search(config.query, &contents)
    };

    for line in results {
        println!("{line}")
    }

    Ok(())
}

fn search<'a>(query: &str, contents: &'a str) -> Vec<&'a str> {
    let mut results = Vec::new();
    for line in contents.lines() {
        if line.contains(query) {  results.push(line); }
    }
    results
}

fn search_case_insensitive<'a>(query: &str, contents: &'a str) -> Vec<&'a str> {
    let mut results = Vec::new();
    for line in contents.lines() {
        if line.to_lowercase().contains(&query.to_lowercase()) {  results.push(line); }
    }
    results
}

#[cfg(test)]

mod tests {
    use super::*;

    #[test]
    fn it_should_search() {
        let query = "duct";
        let contents = "\
Rust:
safe, fast, productive
Pick three.";
        assert_eq!(vec!["safe, fast, productive"], search(query, contents));
    }

    #[test]
    fn case_insensitive() {
        let query = "rUsT";
        let contents = "\
Rust:
safe, fast, productive.
Pick three.
Trust me.";

        assert_eq!(
            vec!["Rust:", "Trust me."],
            search_case_insensitive(query, contents)
        );
    }

}