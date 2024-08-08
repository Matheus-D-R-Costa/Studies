package aulas.dois.exceptions.raffle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Raffle raffle = new Raffle(20);

        int number;
        do {
            System.out.println("Escolha um número!");
            try {
                number = scanner.nextInt();
                raffle.roll(number);
                raffle.getHint();
            } catch (InputMismatchException ex) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next();
            } catch (Exception ex) {
                System.out.println("Ocorreu um erro inesperado: " + ex.getMessage());
            }

        } while (!raffle.isCorrectNumber());
    }
}
