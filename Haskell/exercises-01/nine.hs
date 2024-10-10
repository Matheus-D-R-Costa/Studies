geraLista :: [Int]
geraLista = [1 + 9 * x | x <- [0..7] ]

main :: IO ()
main = print geraLista