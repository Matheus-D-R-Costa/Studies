package edu.senac.intro.aulas.vinteum.entrega;

import java.util.Scanner;

public class OddOrEven {

    static Scanner scanner = new Scanner(System.in);
    static int number;
    static int odds;
    static int evens;
    static String response;
    static boolean condition = false;

    public static void main(String[] args) {

        do {

            System.out.println("Digite um número");
            number = scanner.nextInt();

            if (number % 2 == 0) {
                odds += number;
            } else {
                evens += number;
            }

            System.out.println("Deseja continuar? (S/N)");
            response = String.valueOf(scanner.next().charAt(0));

            if (response.equalsIgnoreCase("n")) {
                condition = true;
            }

            System.out.println("A soma dos números pares é de: " + odds);
            System.out.println("A soma dos números ímpares é de: " + evens);

        } while (!condition);
    }
}
