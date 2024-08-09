package main

import (
	"fmt"
)

func main() {
	bitWiseAND()
	fmt.Println()
	bitWiseOR()
	fmt.Println()
	leftShiftAND()
	fmt.Println()
	rightShiftAND()
}

func bitWiseAND() {
	x := 5
	fmt.Printf("x is %b \n", x)
	fmt.Printf("3 is %03b \n", 3)
	x &= 3
	fmt.Printf("x now is %03b \n", x)
}

func bitWiseOR() {
	x := 5
	fmt.Printf("x is %b \n", x)
	fmt.Printf("3 is %03b \n", 3)
	x |= 3
	fmt.Printf("x now is %03b \n", x)
}

func leftShiftAND() {
	x := 5
	fmt.Printf("x is %b \n", x)
	x >>= 3
	fmt.Printf("x now is %03b \n", x)
}

func rightShiftAND() {
	x := 5
	fmt.Printf("x is %b \n", x)
	x <<= 3
	fmt.Printf("x now is %03b \n", x)
}
