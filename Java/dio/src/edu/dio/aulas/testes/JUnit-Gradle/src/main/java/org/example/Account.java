package org.example;

import java.util.Random;

public class Account {

    private double balance;


    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        validateValue(amount);
        this.balance += amount;
    }

    public void withdraw(double amount) {
        validateValue(amount);
        if (amount > this.balance) throw new IllegalArgumentException("Valor Superior ao Saldo.");
        this.balance -= amount;
    }

    public void transfer(Account sourceAccount, Account destinationAccount, double amount) {
        validateValue(amount);
        destinationAccount.deposit(amount);
        sourceAccount.withdraw(amount);
    }

    private void validateValue(double value) {
        if (value <= 0) throw new IllegalArgumentException("Valor Inválido");
    }

}
