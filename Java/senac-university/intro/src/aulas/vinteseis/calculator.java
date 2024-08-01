package edu.senac.intro.aulas.vinteseis;

import java.util.Scanner;

public class calculator {

    static Scanner scanner = new Scanner(System.in);
    static double numberX;
    static double numberY;
    static char arithmeticOperation;

    public static void main(String[] args) {

        System.out.println("Digite um número x");
        numberX = scanner.nextDouble();

        System.out.println("Digite um número y");
        numberY = scanner.nextDouble();

        System.out.println("Escolha a operação Operação desejada. utilize (+, -, *, /)");
        arithmeticOperation = scanner.next().charAt(0);

        calculate(numberX, numberY, arithmeticOperation);

    }

    static void calculate(double numberX, double numberY, char arithmeticOperation) {

        switch (arithmeticOperation) {
            case '+':
                System.out.println("resultado: " + sum(numberX, numberY));
                break;
            case '-':
                System.out.println("resultado: " + subtraction(numberX, numberY));
                break;
            case '*':
                System.out.println("resultado: " + multiply(numberX, numberY));
                break;
            case '/':
                System.out.println("resultado: " + divide(numberX, numberY));
                break;
            default:
                System.out.println("Operação inexistente. utilize (+, -, *, /)");
        }

    }

    private static double sum(double numberX, double numberY) {
        return numberX + numberY;
    }

    private static double subtraction(double numberX, double numberY) {
        return numberX - numberY;
    }

    private static double multiply(double numberX, double numberY) {
        return numberX * numberY;
    }

    private static double divide(double numberX, double numberY) {
        return numberX / numberY;
    }



}
