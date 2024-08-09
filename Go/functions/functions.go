package main

import (
	"fmt"
)

func main() {

	dayName, dayNumber := getDayNameAndDayNumber("Sabádo")

	fmt.Printf("Você escolheu %v que é o dia %v da semana.", dayName, dayNumber)

}

func getDayNameAndDayNumber(dayName string) (string, int8) {
	days := [7]string{"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabádo", "Domingo"}

	for i, name := range days {
		if name == dayName {
			return name, int8(i + 1)
		}
	}

	return "", -1
}
