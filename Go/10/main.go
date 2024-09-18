package main

import "fmt"

type Calculator struct {
	Name string
}

func (calculator Calculator) Sum(numbers ...int) int {
	total := 0
	for _, number := range numbers {
		total += number
	}

	return total

}

func main() {

	calculator := Calculator {
		Name: "calculadorazinha",
	}

	result := calculator.Sum(2, 2, 2, 2, 2)

	fmt.Println(result)
}

