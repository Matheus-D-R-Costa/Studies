isPalidrome :: String -> Bool
isPalidrome x = x == reverse x

main :: IO ()
main = do
    let str1 = "radar"
    let str2 = "hello"
    print (isPalidrome str1)
    print (isPalidrome str2)