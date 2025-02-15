use std::{env, error::Error, fs};

/// Configura os parâmetros para a execução do programa de busca (minigrep).
///
/// Essa estrutura armazena a query a ser buscada, o caminho do arquivo e se a busca deve ser
/// case-insensitive (não diferencia maiúsculas de minúsculas).
///
/// # Parâmetros
/// - `query`: A string de consulta (busca).
/// - `file_path`: O caminho para o arquivo onde será realizada a busca.
/// - `ignore_case`: Se `true`, a busca ignora diferenças entre maiúsculas e minúsculas.
///
/// # Exemplos
/// ```
/// let args: Vec<String> = std::env::args().collect();
/// let config = parse_config(&args).unwrap();
/// println!("Buscando por '{}' no arquivo '{}'", config.query, config.file_path);
/// ```
pub struct Config<'a> {
    /// Consulta (query) de busca.
    pub query: &'a str,
    /// Caminho do arquivo onde será realizada a busca.
    file_path: &'a str,
    /// Flag que indica se a busca deve ignorar diferenças de maiúsculas e minúsculas.
    ignore_case: bool,
}

impl<'a> Config<'a> {
    /// Cria uma nova instância de `Config`.
    ///
    /// # Parâmetros
    /// - `query`: A consulta de busca.
    /// - `file_path`: O caminho do arquivo.
    /// - `ignore_case`: Indica se a busca deve ser case-insensitive.
    ///
    /// # Retorno
    /// Retorna uma instância de `Config` com os parâmetros informados.
    fn new(query: &'a str, file_path: &'a str, ignore_case: bool) -> Self {
        Self {
            query,
            file_path,
            ignore_case,
        }
    }
}

/// Analisa os argumentos passados pela linha de comando e retorna uma instância de `Config`.
///
/// Essa função espera que `args` seja uma fatia de `String` (por exemplo, o vetor coletado com
/// `std::env::args().collect()`), onde:
/// - o índice 0 é o nome do programa,
/// - o índice 1 é a query,
/// - o índice 2 é o caminho do arquivo.
///
/// Além disso, verifica a existência da variável de ambiente `IGNORE_CASE` para definir o modo de
/// busca.
///
/// # Parâmetros
/// - `args`: Uma fatia de `String` contendo os argumentos da linha de comando.
///
/// # Erros
/// Retorna um erro se houver menos de 3 argumentos ou se algum dos parâmetros necessários estiver
/// ausente.
///
/// # Exemplos
/// ```
/// let args: Vec<String> = std::env::args().collect();
/// let config = parse_config(&args).unwrap();
/// ```
pub fn parse_config<'a>(args: &'a [String]) -> Result<Config<'a>, &'static str> {
    if args.len() < 3 {
        return Err("not enough arguments");
    }

    let query = match args.get(1) {
        Some(arg) => arg,
        None => return Err("Didn't get a query string"),
    };

    let file_path = match args.get(2) {
        Some(arg) => arg,
        None => return Err("Didn't get a file path"),
    };

    let ignore_case = env::var("IGNORE_CASE").is_ok();

    Ok(Config::new(query, file_path, ignore_case))
}

/// Executa a lógica principal do programa.
///
/// Lê o conteúdo do arquivo especificado em `config.file_path` e, de acordo com a flag
/// `config.ignore_case`, realiza uma busca (case-sensitive ou case-insensitive) pelo termo
/// `config.query`. Em seguida, imprime cada linha encontrada.
///
/// # Parâmetros
/// - `config`: Instância de `Config` contendo os parâmetros de execução.
///
/// # Erros
/// Retorna um erro se ocorrer alguma falha ao ler o arquivo ou durante o processamento.
///
/// # Exemplos
/// ```
/// let args: Vec<String> = std::env::args().collect();
/// let config = parse_config(&args).unwrap();
/// run(config).unwrap();
/// ```
pub fn run(config: Config) -> Result<(), Box<dyn Error>> {
    let contents = fs::read_to_string(config.file_path)?;

    let results = match config.ignore_case {
        true => search_case_insensitive(config.query, &contents),
        false => search(config.query, &contents),
    };

    for line in results {
        println!("{line}");
    }

    Ok(())
}

/// Realiza uma busca case-sensitive (sensível a maiúsculas/minúsculas) pelo termo `query` em `contents`.
///
/// Divide o conteúdo em linhas e retorna um vetor contendo as linhas que contêm exatamente
/// o termo de busca.
///
/// # Parâmetros
/// - `query`: A string de busca.
/// - `contents`: O conteúdo no qual a busca será realizada.
///
/// # Retorno
/// Retorna um vetor de fatias (&str) com as linhas que contêm a query.
///
/// # Exemplos
/// ```
/// let results = search("rust", "Rust is fast.\nrust is safe.");
/// ```
fn search<'a>(query: &str, contents: &'a str) -> Vec<&'a str> {
    contents
        .lines()
        .filter(|line| line.contains(query))
        .collect()
}

/// Realiza uma busca case-insensitive (não diferencia maiúsculas/minúsculas) pelo termo `query` em `contents`.
///
/// Converte tanto cada linha quanto a query para minúsculas antes de comparar e retorna as linhas
/// que correspondem à busca.
///
/// # Parâmetros
/// - `query`: A string de busca.
/// - `contents`: O conteúdo onde a busca será realizada.
///
/// # Retorno
/// Retorna um vetor de fatias (&str) com as linhas que correspondem à busca, ignorando a capitalização.
///
/// # Exemplos
/// ```
/// let results = search_case_insensitive("rUsT", "Rust:\ntrust me.");
/// ```
fn search_case_insensitive<'a>(query: &str, contents: &'a str) -> Vec<&'a str> {
    contents
        .lines()
        .filter_map(|line| {
            line.to_lowercase()
                .contains(&query.to_lowercase())
                .then(|| line)
        })
        .collect()
}

#[cfg(test)]
mod tests {
    use super::*;

    /// Testa se a função `search` retorna corretamente a linha que contém a query.
    #[test]
    fn it_should_search() {
        let query = "duct";
        let contents = "\
Rust:
safe, fast, productive
Pick three.";
        assert_eq!(vec!["safe, fast, productive"], search(query, contents));
    }

    /// Testa se a função `search_case_insensitive` retorna corretamente as linhas, ignorando a capitalização.
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
