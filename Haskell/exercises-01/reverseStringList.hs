reverterLista :: [String] -> [String]
reverterLista = map reverse

main :: IO ()
main = do
    let lista = ["apple", "banana", "cherry"]
    print (reverterLista lista)