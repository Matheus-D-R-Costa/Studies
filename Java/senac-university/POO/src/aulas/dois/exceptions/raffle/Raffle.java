package aulas.dois.exceptions.raffle;

import java.util.Random;

public class Raffle {

    private final int chosenNumber;
    private int number;
    private final int bound = 50;

    public Raffle(int chosenNumber) {
        this.chosenNumber = chosenNumber;
        this.number = new Random().nextInt(bound);
    }

    public int getNumber() {
        return number;
    }

    public boolean isCorrectNumber() {
        return number == chosenNumber;
    }

    public void roll() {
        this.number = new Random().nextInt(bound);
    }

    public void roll(int number) {
        this.number = number;
    }

    public void getHint() {
        if (number < chosenNumber) {
            System.out.println("Número escolhido é menor que número sorteado.");
        } else if (number > chosenNumber) {
            System.out.println("Número escolhido é maior que número sorteado.");
        } else {
            System.out.println("Número escolhido é igual número sorteado. Parabéns!");
        }
    }

}
