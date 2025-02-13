use std::{ fs, error::Error };

pub struct Config<'a> {
    pub query: &'a str,
    file_path: &'a str
}

impl<'a> Config<'a>{
    fn new(query: &'a str, file_path: &'a str) -> Self {
        Self {query, file_path}
    }
}

pub fn parse_config(args: &[String]) -> Result<Config, &'static str> {
    if args.len() < 3 {  return Err("not enough arguments") }
    Ok(Config::new(&args[1], &args[2]))
}

pub fn run(config: Config) -> Result<(), Box<dyn Error>> {
    let contents = fs::read_to_string(config.file_path)?;

    for line in search(config.query, &contents) {
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

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn it_should_throw_cavalo() {
        let query = "duct";
        let contents = "\
Rust:
safe, fast, productive
Pick three.";
        assert_eq!(vec!["safe, fast, productive"], search(query, contents));
    }

}