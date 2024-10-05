multiplicar :: Int -> (Int, Int, Int, Int)
multiplicar n = (2 * n, 3 * n, 4 * n, 5 * n)

main :: IO ()
main = do
    let numero = 7
    print (multiplicar numero)
