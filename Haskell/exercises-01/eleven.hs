geraLista :: [Int]
geraLista = [11^x | x <- [0..6]]

main :: IO ()
main = print geraLista