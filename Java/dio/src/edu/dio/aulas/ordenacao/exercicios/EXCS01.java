package edu.dio.aulas.ordenacao.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EXCS01 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int[] ARRAY = new int[10];
        fillArray(ARRAY);

        System.out.println(Arrays.toString(sort(ARRAY)));
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite um número inteiro para o índice " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
    }

    public static int[] sort(int[] array) {
        int aux;

        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        return array;

    }
}
