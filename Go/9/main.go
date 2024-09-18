package main

import "fmt"

type Address struct {
	City   string
	State  string
	number int
}

type Client struct {
	Name     string
	Idade    uint8
	Status   bool
	Endereço Address // Agregação
	Address          // Composição
}

func main() {

	client01 := Client{
		Name:   "Carlos",
		Idade:  20,
		Status: false,
	}

	client01.Endereço.City = "Palhoça"

	client01.Status = true

	fmt.Printf("O nome do cliente é %s tem a idade de %d e esta %t no sistema.\n", client01.Name, client01.Idade, client01.Status)

}
