isSizeEven :: String -> Bool
isSizeEven x = even (length x)

main :: IO ()
main = do
  let str1 = "Hello"
  let str2 = "Hello!"
  print (isSizeEven str1)
  print (isSizeEven str2)