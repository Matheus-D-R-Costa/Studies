package main

import "fmt"

func main() {
	getDay(8)
}

func getDay(day int8) {
	switch day {
	case 1:
		fmt.Println("Segunda")
	case 2:
		fmt.Println("Terça")
	case 3:
		fmt.Println("Quarta")
	case 4:
		fmt.Println("Quinta")
	case 5:
		fmt.Println("Sexta")
	case 6:
		fmt.Println("Sabádo")
	case 7:
		fmt.Println("Domingo")
	default:
		fmt.Println("Valor inválido!")
	}
}
