package main

import (
	"fmt"
	"strings"
)

func main() {
	stock := []string{}
	fillStock(&stock)

	for {
		option := printMenu()

		switch option {
		case "1":
			listAllCars(&stock)
		case "2":
			handleCarExists(&stock)
		case "3":
			handleBuyCar(&stock)
		case "4":
			fmt.Println("Saindo...")
			return
		default:
			fmt.Println("Opção inválida, tente novamente.")
		}
	}
}

func fillStock(stock *[]string) {
	for i := 0; i < 6; i++ {
		car := getCarNameIn()
		*stock = append(*stock, car)
	}

	for {
		option := getOptionIn()
		if option != "s" {
			break
		}
		car := getCarNameIn()
		*stock = append(*stock, car)
	}
}

func getCarNameIn() string {
	fmt.Println("Digite o nome do carro:")
	var name string
	_, err := fmt.Scan(&name)
	if err != nil {
		fmt.Println("Erro ao ler o carro.")
	}
	return strings.ToLower(name)
}

func getOptionIn() string {
	fmt.Println("Deseja adicionar mais carros? (S para sim/Qualquer outra tecla para não):")
	var option string
	_, err := fmt.Scan(&option)
	if err != nil {
		fmt.Println("Erro ao ler a opção.")
	}
	return strings.ToLower(option)
}

func printMenu() string {
	fmt.Println("----------------")
	fmt.Println("1) Listar todos os carros.")
	fmt.Println("2) Verificar a existência de um carro.")
	fmt.Println("3) Comprar um carro.")
	fmt.Println("4) Sair.")
	fmt.Println("----------------")
	var option string
	_, err := fmt.Scan(&option)
	if err != nil {
		fmt.Println("Erro ao ler a opção.")
	}
	return strings.ToLower(option)
}

func listAllCars(stock *[]string) {
	fmt.Println("----------------")
	if len(*stock) == 0 {
		fmt.Println("Nenhum carro no estoque.")
	} else {
		for _, car := range *stock {
			fmt.Println(car)
		}
	}
	fmt.Println("----------------")
}

func handleCarExists(stock *[]string) {
	car := getCarNameIn()
	if isCarExists(stock, &car) {
		fmt.Println("Carro existente no sistema.")
	} else {
		fmt.Println("Carro inexistente no sistema.")
	}
}

func isCarExists(stock *[]string, car *string) bool {
	for _, carInStock := range *stock {
		if carInStock == *car {
			return true
		}
	}
	return false
}

func handleBuyCar(stock *[]string) {
	car := getCarNameIn()
	if !isCarExists(stock, &car) {
		fmt.Println("Carro inexistente no sistema.")
		return
	}
	buyCar(stock, &car)
}

func buyCar(stock *[]string, car *string) {
	deleteCar(stock, car)
	fmt.Println("Carro comprado com sucesso!")
}

func deleteCar(stock *[]string, car *string) {
	for i, carInStock := range *stock {
		if carInStock == *car {
			*stock = append((*stock)[:i], (*stock)[i+1:]...)
			break
		}
	}
}
