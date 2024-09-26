package main

import (
	"html/template"
	"os"
)

type Animal struct {
	Name string
	Age  uint8
}

type Animais []Animal

func main() {

	t := template.Must(template.New("template.html").ParseFiles("template.html"))
	err  := t.Execute(os.Stdout, Animais{
		{"Cavalo", 14},
		{"Gato", 2},
		{"Cachorro", 5},
		{"Cobra", 1},
	})
	if err != nil {
		panic(err)
	}

}
