package edu.senac.intro.aulas.indicador3;

import java.util.Scanner;

public class Electoral {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Qual a sua idade?");
        int age = scanner.nextInt();

        if (age < 16) {
            System.out.println("Não eleitor.");
        } else if (age >= 16 && age < 18 || age > 65) {
            System.out.println("Eleitor facultativo.");
        } else if (age >= 18 && age <= 65) {
            System.out.println("Eleitor obrigatório.");
        }
    }
}
