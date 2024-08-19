package main

import (
	"errors"
	"fmt"
)

func main() {

sum, err := powVerificator(2, 3)
if err != nil {
	panic(err)
}

fmt.Println(sum)

}

func powVerificator(number int, vericatorNumber int) (int, error) {
	if (number * number > vericatorNumber) {
		return number * number, nil
	}

	return 0, errors.New("Pow of this number is less than verificator number")

}