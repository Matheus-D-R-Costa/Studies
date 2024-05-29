package edu.senac.intro.aulas.vintecinco;

import java.util.Arrays;
import java.util.Random;

public class OddNumbers {

    static Random randomNumber = new Random();
    static int[] arrayOfNumbers = new int[10];
    static int quantityOfOddNumbers;

    public static void main(String[] args) {

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = randomNumber.nextInt(100);
        }

        for (int number : arrayOfNumbers) {
            if (number % 2 == 0) {
                quantityOfOddNumbers++;
            }
        }

        System.out.println("O array " + Arrays.toString(arrayOfNumbers) + " tem " + quantityOfOddNumbers + " numeros pares.");

    }
}
