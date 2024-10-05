geraLista :: [String]
geraLista = ["A" ++ [x] ++ "BB" | x <- ['a'..'g']]

main :: IO ()
main = print geraLista