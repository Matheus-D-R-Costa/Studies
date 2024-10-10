toSizeList :: [String] -> [Int]
toSizeList = map length . filter (odd . length)

main :: IO ()
main = do
    let lista = ["apple", "banana", "cherry"]
    print (toSizeList lista)