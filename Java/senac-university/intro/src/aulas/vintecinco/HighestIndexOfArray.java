package edu.senac.intro.aulas.vintecinco;

import java.util.Arrays;
import java.util.Random;

public class HighestIndexOfArray {

    static Random randomNumber = new Random();
    static int[] arrayOfNumbers = new int[10];
    static int highestNumber;

    public static void main(String[] args) {

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = randomNumber.nextInt(100);
        }

        highestNumber = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] > highestNumber) {
                highestNumber = arrayOfNumbers[i];
            }
        }

        System.out.println(Arrays.toString(arrayOfNumbers));
        System.out.println(highestNumber);

    }
}
