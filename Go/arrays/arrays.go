package main

import "fmt"

func main() {
	// Arrays
	var arr [3]int
	arr[0] = 1
	arr[1] = 2
	arr[2] = 3
	fmt.Println("Array:", arr)

	// Slices
	slice := []int{1, 2, 3, 4, 5}
	subSlice := slice[1:3]
	fmt.Println("Slice:", slice)
	fmt.Println("Sub-slice:", subSlice)

	// Modificando o sub-slice também modifica o slice original
	subSlice[0] = 10
	fmt.Println("Slice após modificação:", slice)
	fmt.Println("Sub-slice após modificação:", subSlice)

	//make slices
	brands := make([]string, 3, 6)
	fmt.Println(len(brands))
	fmt.Println(cap(brands))
}
