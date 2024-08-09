package main

import "fmt"

func main() {
	fmt.Println(factorialRecursion(5))
}

func factorialRecursion(x float64) (y float64) {
	if x > 0 {
		y = x * factorialRecursion(x-1)
	} else {
		y = 1
	}

	return

}
