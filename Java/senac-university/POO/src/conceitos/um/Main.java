package conceitos.um;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            try {

                System.out.println("[BANCO]: Olá digite seu nome para iniciar o cadastro!");
                String name = scanner.next();

                System.out.println("[BANCO]: Digite um valor inicial para colocar na conta!");
                double amount = scanner.nextDouble();

                BankAccount account = new BankAccount(name, amount);

                while (account.existsFounds()) {

                    try {
                        System.out.println("[BANCO]: Digite um valor para sacar!");
                        account.withdraw(scanner.nextDouble());
                    } catch (IllegalArgumentException ex) {
                        System.out.println("[BANCO]: Operação inválida! Tente novamente.");
                    }

                    if (account.getFounds() == 0) System.exit(0);

                }


            } catch (IllegalArgumentException ex) {
                System.out.println("[BANCO]: Você inseriu algum valor inválido, tente novamente.");
            }


        }

    }
}
