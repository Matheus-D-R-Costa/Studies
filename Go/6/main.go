package main

import "fmt"

func main() {

	employeeAndWages := map[string]int{"Carlos": 710, "Vinicius": 1000, "P.O": 1700}

	fmt.Println(employeeAndWages["Carlos"])
	delete(employeeAndWages, "Carlos")

	fmt.Println(employeeAndWages)

	employeeAndWages["Carlos"] = 650
	fmt.Println(employeeAndWages["Carlos"])

	wage := make(map[string]int)
	wage["Matheus"] = 0

	fmt.Println(wage)

	for employee, wage := range employeeAndWages {
		fmt.Printf("O camarada %v tem um salário de %d\n", employee, wage)
	}

	sumOfWages := 0
	for _, wage := range employeeAndWages {
		sumOfWages += wage
	}

	fmt.Printf("A soma dos salários é de: %d\n", sumOfWages)

}