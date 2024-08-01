package edu.senac.intro.aulas.vintecinco;

import java.util.Arrays;
import java.util.Random;

public class ArrayMultiplier {

    static Random randomNumber = new Random();
    static int[] arrayOfNumbers;

    public static void main(String[] args) {

        arrayOfNumbers = new int[10];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = randomNumber.nextInt(20);
        }

        System.out.println(Arrays.toString(arrayOfNumbers));

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = arrayOfNumbers[i] * 2;
        }

        System.out.println(Arrays.toString(arrayOfNumbers));

    }

}
