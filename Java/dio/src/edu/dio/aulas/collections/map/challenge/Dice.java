package edu.dio.aulas.collections.map.challenge;

import java.util.Random;

public class Dice {

    Random random = new Random();

    public int getNumber() {
        return roll();
    }

    public int roll() {
        int newNumber = random.nextInt(6) + 1;
        int number;
        return number = newNumber;
    }
}
