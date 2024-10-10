package main

import (
	"bytes"
	"io"
	"net/http"
	"os"
)

func main() {
	json := bytes.NewBuffer([]byte(`{"userId": 1, "id": 27, "title": "Cavalo", "body": "Rei leão"}`))

	resp, err := http.Post("https://jsonplaceholder.typicode.com/posts", "application/json", json)
	if err != nil {
		panic(err)
	}

	defer resp.Body.Close()

	io.CopyBuffer(os.Stdout, resp.Body, nil)

}