package edu.senac.intro.aulas.indicador3.ImcCalculator;

import java.util.Scanner;

public class User {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Qual a sua altura?");
        double height = scanner.nextDouble();

        System.out.println("Qual seu gênero? (M/F)");
        String sex = scanner.next();

        Calculator calculator = new Calculator(height, sex);

        System.out.println("Seu peso ideal é de: " + calculator.imc + "kg");
    }
}
