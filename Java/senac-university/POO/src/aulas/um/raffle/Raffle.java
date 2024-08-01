package aulas.um.raffle;

import java.util.Random;

public class Raffle {

    private final int chosenNumber;
    private int number;

    public Raffle(int chosenNumber) {
        this.chosenNumber = chosenNumber;
        this.number = new Random().nextInt(100);
    }

    public boolean isCorrectNumber() {
        return number == chosenNumber;
    }

    public int getNumber() {
        return number;
    }

    public void roll() {
        this.number = new Random().nextInt(100);
    }

}
