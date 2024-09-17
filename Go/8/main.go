package main

import "fmt"

func main() {

	result := func() int {
		return sum(2, 2) * 2
	}()

	fmt.Println(result)

}

func sum(numbers ...int) int {
	total := 0
	for _, number := range numbers {
		total += number
	}

	return total

}