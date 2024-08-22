package aulas.quatro.ex1;

import java.util.Random;

public class Main {

    static int[] numberOfOccurrencesOfNotes = new int[10];

    public static void main(String[] args) {
        int[] numberOfNotes = new int[30];
        getNewRandomNotes(numberOfNotes);

        for (int i = 0; i < numberOfOccurrencesOfNotes.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + numberOfOccurrencesOfNotes[i] + " ocorrencia(s)");
        }
    }

    public static void getNewRandomNotes(int[] amountOfNotes) {
        for (int i = 0; i < amountOfNotes.length; i++) {
            amountOfNotes[i] = getNewRandomInteger();
            analiseIntegers(amountOfNotes[i]);
        }
    }

    public static int getNewRandomInteger() {
        return new Random().nextInt(10) + 1;
    }

    public static void analiseIntegers(int number) {
        if (number >= 1 && number <= 10) {
            numberOfOccurrencesOfNotes[number - 1]++;
        }
    }
}
