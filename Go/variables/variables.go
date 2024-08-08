package main

import (
	"fmt"
)

func main() {
	// ordem de segurança
	/*const
	:=
	var */

	const student01 string = "Halland"
	const student02 = "Rodrygo"
	student03 := "Cavalo"
	var dog string

	fmt.Println(student01)
	fmt.Println(student02)

	student03 = "cavalo"

	fmt.Println(student03)

	var a string
	var b int
	var c bool

	fmt.Println(a)
	fmt.Println(b)
	fmt.Println(c)

	dog = "Neymar"
	fmt.Println(dog)

}
