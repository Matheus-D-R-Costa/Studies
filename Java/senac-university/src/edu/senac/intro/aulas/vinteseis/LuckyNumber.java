package edu.senac.intro.aulas.vinteseis;

import java.util.Scanner;

public class LuckyNumber {

    static Scanner scanner = new Scanner(System.in);
    static int luckyNumber = 21;

    public static void main(String[] args) {

        chooseNumber();

    }

    static void chooseNumber() {
        System.out.println("Escolha um número");
        int chosedNumber = scanner.nextInt();
        compareNumbers(chosedNumber);

    }

    static void compareNumbers(int number) {

        if (number == luckyNumber) {
            System.out.println("Você escolheu o número correto. POG");
        } else {
            System.out.println("Cavalo.");
        }
    }


}
