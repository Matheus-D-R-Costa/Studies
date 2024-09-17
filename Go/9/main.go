package main

import "fmt"

type Cliente struct {
	Name string
	Idade uint8
	Status bool
}

func main() {

	cliente01 := Cliente{
		Name: "Carlos",
		Idade: 20,
		Status: false,
	}

	cliente01.Status = true

	fmt.Printf("O nome do cliente é %s tem a idade de %d e esta %t no sistema.\n", cliente01.Name, cliente01.Idade, cliente01.Status)

}