package edu.senac.intro.aulas.vintedois;

import java.util.Random;
import java.util.Scanner;

public class Raffle {

    static Scanner scanner = new Scanner(System.in);
    static int sortedNumber = new Random().nextInt(21);

    public static void main(String[] args) {

        System.out.println(sortedNumber);

        while (true) {

            System.out.println("Escolha um numero");
            int number = scanner.nextInt();

            if (number == sortedNumber) {
                System.out.println("Voce ganhou no bingo do SENAC, o numero sorteado e " + sortedNumber + " e seu número e: " + number);
                break;
            } else {
                System.out.println("Você nao ganhou no bingo do SENAC");

                if (number < sortedNumber) {
                    System.out.println("Seu numero escolhido e menor que o numero sorteado.");
                } else {
                    System.out.println("Seu número escolhido e maior que o numero sorteado.");
                }
            }
        }
    }

}
