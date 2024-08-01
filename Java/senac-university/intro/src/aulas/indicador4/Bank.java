package edu.senac.intro.aulas.indicador4;

import java.util.Scanner;

public class Bank {

    static Scanner scanner = new Scanner(System.in);
    static double balance = 0.0;
    static String userName;
    static String response = "";
    static int numberOfWithdraws = 0;

    public static void main(String[] args) {

        System.out.println("Olá, digite o nome do usuario da sua conta para logar.");
        userName = readData();
        System.out.println("Logado como " + userName);
        System.out.println("Digite a quantidade para depositar.");
        balance = scanner.nextDouble();

        while (balance != 0) {
            System.out.println(" ");
            System.out.println("Digite o número correspondente a sua escolha.");
            System.out.println(" ");
            System.out.println("<--------------------------------------------->");
            System.out.println("1) Depositar?");
            System.out.println("2) Sacar?");
            System.out.println("3) Exibir Extrato ");
            System.out.println("4) Sair.");
            System.out.println("<--------------------------------------------->");

            response = readData();

            switch (response) {
                case "1":
                    System.out.println("Digite a quantidade para depositar.");
                    double DepositAmount = scanner.nextDouble();
                    balance += DepositAmount;
                    break;

                case "2":
                    System.out.println("Digite a quantidade para sacar.");
                    double withdrawAmount = scanner.nextDouble();

                    if (withdrawAmount >= balance) {
                        balance = 0;
                    } else {
                        balance -= withdrawAmount;
                    }

                    numberOfWithdraws++;

                    break;

                case "3":
                    System.out.println("<------------>");
                    System.out.println("Username = " + userName);
                    System.out.println("Saldo = " + balance);
                    System.out.println("Saques realizados = " + numberOfWithdraws);
                    System.out.println("<------------>");
                    break;

                case "4":
                    System.out.println("Aplicação encerrada.");
                    System.exit(0);
                    break;
            }
        }

        System.out.println("Saques realizados = " + numberOfWithdraws);

    }

    public static String readData() {
        String text = scanner.nextLine();
        return text;
    }
}
