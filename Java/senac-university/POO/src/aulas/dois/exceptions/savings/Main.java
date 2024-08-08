package aulas.dois.exceptions.savings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dinheiro que você tem na poupança!");

        try {
            Savings savings = new Savings(scanner.nextDouble());
            System.out.println("Seu rendimento em 1 ano é de: " + savings.getYield(12) + "R$");
        } catch (InputMismatchException ex) {
            System.out.println("Entrada inválida!");
        }

    }

}
