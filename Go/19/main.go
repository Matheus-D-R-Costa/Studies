package main

import "fmt"

func main() {

	for i := 0; i <= 10; i++ {
		fmt.Print(i)
		if i == 10 {
			fmt.Println()
		}
	}

	fruits := []string{"maça", "banana", "pera"}
	for i, v := range fruits {
		println(i, v)
	}

	i := 0
	for i < 10 {
		print(i)
		i++
	}

	for {
		println("Hello World")
	}

}