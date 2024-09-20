package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	file, err := os.Create("file.txt")
	if err != nil {
		panic(err)
	}

	// 	size, err := file.Write([]byte("Hello World!")) para escrever dados que não são uma string...

	size, err := file.WriteString("Hello World!")
	if err != nil {
		panic(err)
	}

	fmt.Printf("Arquivo criado com sucesso! Tamanho: %d bytes\n", size)

	file.Close()

	// leitura
	archive, err := os.ReadFile("file.txt")
	if err != nil {
		panic(err)
	}

	fmt.Println(string(archive))

	// leitura linha a linha
	archive2, err := os.Open("file.txt")
	if err != nil {
		panic(err)
	}

	reader := bufio.NewReader(archive2)
	buffer := make([]byte, 10)
	for {
		n, err := reader.Read(buffer)
		if err != nil {
			break
		}

		fmt.Println(string(buffer[:n]))

	}

	err = os.Remove("file.txt")
	if err != nil {
		panic(err)
	}

}
