geraLista :: [Int]
geraLista = [x | x <- [1..39], x `mod` 4/= 0]

main :: IO ()
main = print geraLista
