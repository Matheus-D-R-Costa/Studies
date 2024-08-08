package main

import (
	"fmt"
)

func main() {
	cassino := "cassino"
	cassinoAsNumber := 777
	verdadeiro := true
	falso := false
	const PI float32 = 3.145

	fmt.Printf("cassino has value: %v and type: %T\n", cassino, cassino)
	fmt.Printf("cassinoAsNumber has value: %v and type %T\n", cassinoAsNumber, cassinoAsNumber)

	fmt.Println()

	fmt.Printf("%b\n", cassinoAsNumber)
	fmt.Printf("%d\n", cassinoAsNumber)
	fmt.Printf("%+d\n", cassinoAsNumber)
	fmt.Printf("%o\n", cassinoAsNumber)
	fmt.Printf("%O\n", cassinoAsNumber)
	fmt.Printf("%x\n", cassinoAsNumber)
	fmt.Printf("%X\n", cassinoAsNumber)
	fmt.Printf("%#x\n", cassinoAsNumber)
	fmt.Printf("%4d\n", cassinoAsNumber)
	fmt.Printf("%-4d\n", cassinoAsNumber)
	fmt.Printf("%04d\n", cassinoAsNumber)

	fmt.Println()

	fmt.Printf("%s\n", cassino)
	fmt.Printf("%q\n", cassino)
	fmt.Printf("%8s\n", cassino)
	fmt.Printf("%-8s\n", cassino)
	fmt.Printf("%x\n", cassino)
	fmt.Printf("% x\n", cassino)

	fmt.Println()

	fmt.Printf("%t\n", verdadeiro)
	fmt.Printf("%t\n", falso)

	fmt.Println()

	fmt.Printf("%e\n", PI)
	fmt.Printf("%f\n", PI)
	fmt.Printf("%.2f\n", PI)
	fmt.Printf("%6.2f\n", PI)
	fmt.Printf("%g\n", PI)
}
