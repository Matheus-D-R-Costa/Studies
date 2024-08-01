package edu.senac.intro.aulas.dezesete;

import java.util.Scanner;

public class ChoseedDaySwitch {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("digite um número entre 1 e 7");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Dia escolhido foi Domingo");
                break;
            case 2:
                System.out.println("Dia escolhido foi Segunda");
                break;
            case 3:
                System.out.println("Dia escolhido foi Terça");
                break;
            case 4:
                System.out.println("Dia escolhido foi Quarta");
                break;
            case 5:
                System.out.println("Dia escolhido foi Quinta");
                break;
            case 6:
                System.out.println("Dia escolhido foi Sexta");
            case 7:
                System.out.println("Dia escolhido foi Sabadão");
                break;
            default:
                System.out.println("Um número de 1 a 7.");
        }
    }
}
