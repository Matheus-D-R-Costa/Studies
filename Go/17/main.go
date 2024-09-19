package main

import "fmt"

func main() {
	employeeAndWages := map[string]int{"Carlos": 710, "Vinicius": 1000, "P.O": 1700}
	fmt.Println(sumWages(employeeAndWages))
	fmt.Println(averageWageOf(employeeAndWages))

	employeeAndWages2 := map[string]float64{"Carlos": 710.0, "Vinicius": 1000.0, "P.O": 1700.0}
	fmt.Println(sumWages(employeeAndWages2))
	fmt.Println(averageWageOf(employeeAndWages2))

	fmt.Println(compare(30, 31))
}

func sumWages[T int | float32 | float64](m map[string]T) T {
	var total T
	for _, v := range m {
		total += v
	}

	return total
}

type Number interface {
	int | float32 | float64
}

func averageWageOf[T Number](m map[string]T) T {
	total := sumWages(m)
	return total / T(len(m))
}

func compare[T comparable] (a T, b T) bool {
	if a == b {
		return true
	}

	return false

}
