package main

import (
	"fmt"
	"math"
	"sync"
	"time"
)

type Matrix [2][2]int

var recursiveCount = 0
var interactiveCount = 1
var matrixCount = 0

func main() {
	var wg sync.WaitGroup
	results := make(chan string, 4)

	wg.Add(4)

	// Goroutine para recursiveFibonacci
	go func() {
		defer wg.Done()
		startTime := time.Now()
		result := recursiveFibonnaci(40)
		endTime := time.Now()
		executionTime := endTime.Sub(startTime)
		results <- fmt.Sprintf("Recursive Fibonacci: %d, Levou %v microsegundos e %d operações", result, executionTime.Microseconds(), recursiveCount)
	}()

	// Goroutine para interactiveFibonnaci
	go func() {
		defer wg.Done()
		startTime := time.Now()
		result := interactiveFibonnaci(40)
		endTime := time.Now()
		executionTime := endTime.Sub(startTime)
		results <- fmt.Sprintf("Interactive Fibonacci: %d, Levou %v microsegundos e %d operações", result, executionTime.Microseconds(), interactiveCount)
	}()

	// Goroutine para matrixFibonacci
	go func() {
		defer wg.Done()
		startTime := time.Now()
		result := matrixFibonnaci(40)
		endTime := time.Now()
		executionTime := endTime.Sub(startTime)
		results <- fmt.Sprintf("Matrix Fibonacci: %d, Levou %v microsegundos e %d operações", result, executionTime.Microseconds(), matrixCount)
	}()

	// Goroutine para binetFibonnaci
	go func() {
		defer wg.Done()
		startTime := time.Now()
		result := binetFibonnaci(40)
		endTime := time.Now()
		executionTime := endTime.Sub(startTime)
		results <- fmt.Sprintf("Binet Fibonacci: %d, Levou %v microsegundos e %d operações", result, executionTime.Microseconds(), 1)
	}()

	wg.Wait()
	close(results)

	for result := range results {
		fmt.Println(result)
	}
}

// O(2)^n
func recursiveFibonnaci(n int) int {
	recursiveCount++
	if n == 0 || n == 1 {
		return n
	}
	return recursiveFibonnaci(n-1) + recursiveFibonnaci(n-2)
}

// O(n)
func interactiveFibonnaci(n int) int {
	if n <= 0 {
		return 0
	} else if n == 1 {
		return 1
	}

	a, b := 0, 1
	for i := 2; i <= n; i++ {
		interactiveCount++
		a, b = b, a+b
	}

	return b
}

// O(log n)
func matrixFibonnaci(n int) int {
	F := Matrix{{1, 1}, {1, 0}}

	if n == 0 {
		return 0
	}

	power(&F, n-1)

	return F[0][0]
}

func power(F *Matrix, n int) {
	M := Matrix{{1, 1}, {1, 0}}
	for i := 2; i <= n; i++ {
		multiply(F, M)
		matrixCount++
	}
}

func multiply(F *Matrix, M Matrix) {
	x := F[0][0]*M[0][0] + F[0][1]*M[1][0]
	y := F[0][0]*M[0][1] + F[0][1]*M[1][1]
	z := F[1][0]*M[0][0] + F[1][1]*M[1][0]
	w := F[1][0]*M[0][1] + F[1][1]*M[1][1]

	F[0][0] = x
	F[0][1] = y
	F[1][0] = z
	F[1][1] = w
}

// O(1)
func binetFibonnaci(n int) int {
	phi := (1 + math.Sqrt(5)) / 2

	result := math.Round((math.Pow(phi, float64(n)) - math.Pow(-phi, -float64(n))) / math.Sqrt(5))

	return int(result)
}
