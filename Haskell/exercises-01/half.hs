geraList :: [Float]
geraList = [1 / (2^x) | x <- [0..5]]

main :: IO ()
main = print geraList