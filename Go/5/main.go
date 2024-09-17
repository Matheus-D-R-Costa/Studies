package main

import "fmt"

func main() {
	slicezinho := []int{2, 4, 8, 16, 32, 64, 128, 256} // Sempre declare um slice com =/- o valor final dele

	fmt.Printf("len=%d cap=%d %v\n", len(slicezinho), cap(slicezinho), slicezinho)
	fmt.Printf("len=%d cap=%d %v\n", len(slicezinho[:0]), cap(slicezinho[:0]), slicezinho[:0])
	fmt.Printf("len=%d cap=%d %v\n", len(slicezinho[:4]), cap(slicezinho[:4]), slicezinho[:4])
	fmt.Printf("len=%d cap=%d %v\n", len(slicezinho[2:]), cap(slicezinho[2:]), slicezinho[2:])

	slicezinho = append(slicezinho, 512)
	fmt.Printf("len=%d cap=%d %v\n", len(slicezinho), cap(slicezinho), slicezinho)

}