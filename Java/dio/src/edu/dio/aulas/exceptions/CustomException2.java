package edu.dio.aulas.exceptions;

public class CustomException2 {

    public static void main(String[] args) {
        int[] numerators = {2, 4, 8, 6};
        int[] denominators = {2, 2, 0, 2, 5};

        divideAndPrint(numerators, denominators);

        System.out.println("O programa continua...");
    }

    public static void divideAndPrint(int[] numerators, int[] denominators) {
        int result = 0;

        for (int i = 0; i < denominators.length; i++) {

            try {
                result = numerators[i] / denominators[i];
                System.out.println(i + ". Resultado = " + result);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println(i + ". Resultado = " + e.getMessage());
            }

        }
    }
}
