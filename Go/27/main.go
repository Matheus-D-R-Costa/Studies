package main

import (
	"html/template"
	"os"
)

type Animal struct {
	Name string
	Age  uint8
}

func main() {

	horse := Animal{"Cavalo", 40}
	tmp := template.New("HorseTemplate")
	tmp, _ = tmp.Parse("Animal: {{.Name}} - Idade: {{.Age}}")
	err  := tmp.Execute(os.Stdout, horse)
	if err != nil {
		panic(err)
	}

}
