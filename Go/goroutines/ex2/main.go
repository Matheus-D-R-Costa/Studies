package main

import (
	"fmt"
	"time"
)

func main() {
	fmt.Print("Digite o número de workers: ")

	var numberOfWorkers int;
	fmt.Scanln(&numberOfWorkers)

	ch := make(chan int)

	for i := 0; i < numberOfWorkers; i++{
		go worker(i + 1, ch)
	}

	for i := 1; i < 11; i++ {
		ch <- i
	}


}

func worker(workerId int, data chan int) {
	for i := range data {
		fmt.Printf("worker %d got %d\n", workerId, i)
		time.Sleep(time.Second)
	}
}