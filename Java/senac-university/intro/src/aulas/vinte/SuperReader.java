package edu.senac.intro.aulas.vinte;

import java.util.Scanner;

public class SuperReader {

    static Scanner scanner = new Scanner(System.in);

    static int number;

    public static void main(String[] args) {

        System.out.println("Fala um número paizão");
        number = scanner.nextInt();

        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = (number * 3 + 1) / 2;
                System.out.println(number);
            }
        }
    }
}
