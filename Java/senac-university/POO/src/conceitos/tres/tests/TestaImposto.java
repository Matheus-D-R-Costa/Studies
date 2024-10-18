package conceitos.tres.tests;

import conceitos.tres.models.Conta;

import java.util.Scanner;

public class TestaImposto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para a conta...");
        Conta conta = new Conta(scanner.next());

        System.out.println("Digite um valor para depositar na conta...");
        conta.depositar(scanner.nextDouble());

        try {
            System.out.println("Digite um valor para sacar...");
            conta.sacar(scanner.nextDouble());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(conta.getAcumuladorImposto());

        try {
            System.out.println("Digite outro valor para sacar...");
            conta.sacar(scanner.nextDouble());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(conta.getAcumuladorImposto());

    }

}
