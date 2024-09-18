package main

type Account struct {
	balance int
}

func NewAccount(balance int) *Account {
	return &Account{balance: balance}
}

func (acc Account) simulateDeposit(amount int) {
	acc.balance += amount
	println(acc.balance)
}

func (acc *Account) deposit(amount int) {
	acc.balance += amount
	println(acc.balance)
}

func main() {

	acc := NewAccount(100)

	acc.simulateDeposit(50)
	println(acc.balance)

	acc.deposit(50)
	println(acc.balance)

}



