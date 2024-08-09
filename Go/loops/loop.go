package main

import (
	"fmt"
)

func main() {
	const SORTED_NUMBER int8 = 15
	var number int8

	for true {
		fmt.Println("Choose a number!")
		fmt.Scanln(&number)

		if number < SORTED_NUMBER {
			fmt.Println("Your number is less than sorted number")
		} else if number > SORTED_NUMBER {
			fmt.Println("Your number is greather than sorted number")
		} else {
			fmt.Println("Congratulations, you win!")
			break
		}
	}
}
