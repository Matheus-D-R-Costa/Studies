package main

import (
	"fmt"
)

func main() {
	var name string
	var lastName string

	fmt.Scanln(&name)
	fmt.Scan(&lastName)

	fmt.Printf("Your fullname = %v %v", name, lastName)

}
