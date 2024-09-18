package main

import "fmt"

func main() {
	var x interface{} = 10
	var y interface{} = "Hello, World!"

	showType(x)
	showType(y)
}

func showType(variable interface{}) {
	fmt.Printf("O tipo da variável é %T e o valor é de %v\n", variable, variable)
}