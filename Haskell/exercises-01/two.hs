gerarLista :: [Int]
gerarLista = [x | x <- [2..30], even x, x `mod` 6/= 0]

main :: IO ()
main = print gerarLista