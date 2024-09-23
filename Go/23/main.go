package main

import (
	"encoding/json"
	"fmt"
	"io"
	"net/http"
	"os"
)

type ViaCep struct {
	Cep         string `json:"cep"`
	Logradouro  string `json:"logradouro"`
	Complemento string `json:"complemento"`
	Unidade     string `json:"unidade"`
	Bairro      string `json:"bairro"`
	Localidade  string `json:"localidade"`
	Uf          string `json:"uf"`
	Estado      string `json:"estado"`
	Regiao      string `json:"regiao"`
	Ibge        string `json:"ibge"`
	Gia         string `json:"gia"`
	Ddd         string `json:"ddd"`
	Siafi       string `json:"siafi"`
}

func writeToFile(viaCep ViaCep) error {
	// Abre o arquivo em modo de append, criando-o se não existir
	file, err := os.OpenFile("ViaCepQueries.txt", os.O_APPEND|os.O_CREATE|os.O_WRONLY, 0644)
	if err != nil {
		return fmt.Errorf("erro ao abrir o arquivo: %w", err)
	}
	defer file.Close()

	_, err = file.WriteString(fmt.Sprintf("CEP: %s, Logradouro: %s, Bairro: %s, Localidade: %s, UF: %s\n",
		viaCep.Cep, viaCep.Logradouro, viaCep.Bairro, viaCep.Localidade, viaCep.Uf))
	if err != nil {
		return fmt.Errorf("erro ao escrever no arquivo: %w", err)
	}
	return nil
}

func main() {
	for _, cep := range os.Args[1:] {
		url := fmt.Sprintf("http://viacep.com.br/ws/%s/json", cep)
		req, err := http.Get(url)
		if err != nil {
			fmt.Println("Erro ao buscar o CEP:", err)
			continue
		}
		defer req.Body.Close()

		res, err := io.ReadAll(req.Body)
		if err != nil {
			fmt.Println("Erro ao ler a resposta:", err)
			continue
		}

		var viaCep ViaCep
		err = json.Unmarshal(res, &viaCep)
		if err != nil {
			fmt.Println("Erro ao decodificar o JSON:", err)
			continue
		}

		if viaCep.Cep == "" {
			fmt.Printf("CEP %s não encontrado.\n", cep)
			continue
		}

		err = writeToFile(viaCep)
		if err != nil {
			fmt.Println(err)
		}
	}
}
