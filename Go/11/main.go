package main

import "fmt"

type Food interface {
	GetNutrition() uint16
}

type Sausage struct {
	Kcals uint16
}

func (sausage Sausage) GetNutrition() uint16 {
	return sausage.Kcals
}

func main() {
	sadia := Sausage{
		Kcals: 250,
	}

	fmt.Println(sadia.GetNutrition())

}
