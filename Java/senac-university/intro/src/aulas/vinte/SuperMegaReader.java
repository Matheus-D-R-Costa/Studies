package edu.senac.intro.aulas.vinte;

import java.util.Scanner;

public class SuperMegaReader {

    static Scanner scanner = new Scanner(System.in);

    static int value;
    static int sum;

    public static void main(String[] args) {

        while (true) {
            System.out.println("Digite um número meu lorde");
            value = scanner.nextInt();

            sum += value;

            if (value == 0) {
                break;
            }
        }

        System.out.println(sum);
    }
}
