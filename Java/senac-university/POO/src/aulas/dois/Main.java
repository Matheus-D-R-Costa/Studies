package aulas.dois;


import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int denominator;
        int numerator;
        int result;

        while (true) {
            System.out.println("Digite o denominador.");
            denominator = scanner.nextInt();

            System.out.println("Digite o numerador.");
            numerator = scanner.nextInt();

            try {
                result = denominator / numerator;
                break;
            } catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }

        }

        System.out.println(result);

    }

}