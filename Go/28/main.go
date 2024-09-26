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
	t := template.Must(template.New("HorseTemplate").Parse("Animal: {{.Name}} - Idade: {{.Age}}"))
	err  := t.Execute(os.Stdout, horse)
	if err != nil {
		panic(err)
	}

}
