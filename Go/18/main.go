package main

import (
	"fmt"
	"github.com/random/path/calculator"
	"github.com/google/uuid"
)

func main() {

	fmt.Printf("Result: %v\n", calculator.Sum(10, 10, 10))
	fmt.Println(calculator.A)

	car := calculator.Car {Brand: "Chevrolet"}
	fmt.Println(car)
	car.SpeedUp()

	fmt.Println(uuid.New())
}