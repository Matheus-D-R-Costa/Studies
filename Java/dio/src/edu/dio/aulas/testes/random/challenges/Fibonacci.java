package edu.dio.aulas.testes.random.challenges;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacci(40)));
    }

    public static int[] fibonacci(int number) {
        if (number < 2) throw new IllegalArgumentException("O número deve ser pelo menos 2");

        int[] fibonacci = new int[number];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < number; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }
}
