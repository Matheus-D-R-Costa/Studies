package main

import (
	"encoding/json"
	"os"
)

type Account struct {
	Agency uint16 `json:"agency"`
	Balance int `json:"-"`
}

func NewAccount(agency uint16, balance int) *Account {
	return &Account{Agency: agency, Balance: balance}
}

func main() {

	acc := NewAccount(1234, 100)

	res, err := json.Marshal(acc)
	if err != nil {
		println(err)
	}

	println(string(res))

	err = json.NewEncoder(os.Stdout).Encode(acc)
	if err != nil {
		println(err)
	}

	pureJson := []byte(`{"agency":4231, "b":500}`)
	accX := Account{}
	err = json.Unmarshal(pureJson, &accX)
	if err != nil {
		println(err)
	}

	println(accX.Balance)

}