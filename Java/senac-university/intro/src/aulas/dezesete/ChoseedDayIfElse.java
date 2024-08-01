package edu.senac.intro.aulas.dezesete;

import java.util.Scanner;

public class ChoseedDayIfElse {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("digite um número entre 1 e 7");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Dia escolhido foi Domingo");
        } else if (number == 2) {
            System.out.println("Dia escolhido foi Segunda");
        } else if (number == 3) {
            System.out.println("Dia escolhido foi Terça");
        } else if (number == 4) {
            System.out.println("Dia escolhido foi Quarta");
        } else if (number == 5) {
            System.out.println("Dia escolhido foi Quinta");
        } else if (number == 6) {
            System.out.println("Dia escolhido foi Sexta");
        } else if (number == 7) {
            System.out.println("Dia escolhido foi Sabado");
        } else {
            System.out.println("Digite um número de 1 até 7.");
        }



    }
}
