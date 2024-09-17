package main

import "fmt"

func main() {
	var arrayzinho [3]int
	arrayzinho[0] = 10
	arrayzinho[1] = 20
	arrayzinho[2] = 30

	fmt.Printf("O meu arrayzinho tem %v elementos\n", len(arrayzinho))
	fmt.Printf("e %v indíces...\n", len(arrayzinho) - 1)
	fmt.Printf("arrayzinho: %v\n", arrayzinho)

	fmt.Println("\narrayzinho percorrido...")

	for i, v := range arrayzinho {
		fmt.Printf("O valor do indíce %d é de %d\n", i, v)
	}
}