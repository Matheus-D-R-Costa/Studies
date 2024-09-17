package main

import (
	"errors"
	"fmt"
)

func main() {

	resultOfSum, errs := sum(20, 10)
	if errs != nil {
		fmt.Println(errs)
	}

	fmt.Println(resultOfSum)

	resultOfDivision, errd := divide(8, 0)
	if errd != nil {
		fmt.Println(errd)
	}

	fmt.Println(resultOfDivision)

	fmt.Println(refactoredSum(1, 2, 4, 7, 9, 3, 1, 121, 512))

}

func sum(a, b int) (int, error) {
	if a == b {
		return 0, errors.New("Os números são iguais!")
	}

	return a + b, nil

}

func divide(a, b int) (int, error) {
	if a == 0 || b == 0 {
		return 0, errors.New("Impossivel dividir por 0!")
	}

	return a / b, nil

}

func refactoredSum(numbers ...int) int {
	total := 0
	for _, number := range numbers {
		total += number
	}

	return total

}