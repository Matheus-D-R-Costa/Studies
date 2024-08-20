package main

import (
	"fmt"
	"time"
)

func main() { // goroutine 1

	ch := make(chan string) // empty

	// goroutine 2
	go func ()  {
		ch <- "Cavalo"
	}()

	go counter(5)

	message := <- ch
	fmt.Println(message)

	counter(5)


}

func counter(number int) {
	for i := 0; i < number; i++ {
		fmt.Println(i + 1)
		time.Sleep(time.Second)
	}
}