package calculator

import "fmt"

func Sum[T int | float32 | float64] (numbers ...T) T { // Função publica
	var total T
	for _, number := range numbers {
		total += number
	}

	return total

}

func sum[T int | float32 | float64] (numbers ...T) T {  // Função privada
	var total T
	for _, number := range numbers {
		total += number
	}

	return total

}

var A = 10
var a = 10

type Car struct {
	Brand string
	brand string
}

func (car Car) SpeedUp() {
	fmt.Println("Vruum")
}

func (car Car) speedUp() {
	fmt.Println("Vruum")
}
