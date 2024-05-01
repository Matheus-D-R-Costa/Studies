package edu.senac.intro.aulas.vinteum;

import java.util.Scanner;

public class MultiplicationTable {

    static Scanner scanner = new Scanner(System.in);

    static int number;
    static int multiplier = 0;
    static int result;

    public static void main(String[] args) {

        System.out.println("Digite o número da tabuada solicitada");
        number = scanner.nextInt();

        do {
            multiplier++;
            result = number * multiplier;

            System.out.println(number + " x " + multiplier + " = " + result);

        } while (multiplier < 10);
    }
}