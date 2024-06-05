package edu.senac.intro.aulas.vinteseis;

import java.util.Scanner;

public class calculator {

    static Scanner scanner = new Scanner(System.in);
    static int numberX;
    static int numberY;
    static int result;

    public static void main(String[] args) {

        calculate(2,3, "+");

    }

    static void calculate(int numberX, int numberY, String arithmeticOperation) {

        switch (arithmeticOperation) {
            case "+":
                sum(numberX, numberY);
                break;
            case "-":
                subtraction(numberX, numberY);
                break;
            case "*":
                multiply(numberX, numberY);
                break;
            case "/":
                divide(numberX, numberY);
                break;
            default:
                System.out.println("Operação inexistente. utilize (+, -, *, /)");
        }

        System.out.println(result);

    }

    private static void sum(int numberX, int numberY) {
        result = numberX + numberY;
    }

    private static void subtraction(int numberX, int numberY) {
        result = numberX - numberY;
    }

    private static void multiply(int numberX, int numberY) {
        result = numberX * numberY;
    }

    private static void divide(int numberX, int numberY) {
        result = numberX / numberY;
    }



}
