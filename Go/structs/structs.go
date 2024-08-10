package main

import "fmt"

type Person struct {
	name string
	age  int8
}

func main() {

	p1 := Person{
		name: "Kylian",
		age:  19,
	}

	p2 := Person{
		name: "Jake",
		age:  17,
	}

	persons := []Person{p1, p2}
	for i := 0; i < len(persons); i++ {
		fmt.Printf("%v. pessoa = %v\n", i+1, persons[i])
	}

}
