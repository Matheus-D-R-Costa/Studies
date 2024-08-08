package aulas.dois.exceptions.inversor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();

        String invertedString = inverter(word);
        System.out.println(invertedString);

    }

    public static String inverter(String word) {
        if (word.contains(",") || word.contains(" ")) {
            throw new IllegalArgumentException("entrada inválida!");
        }

        String[] box = {word};

        StringBuilder invertedString = new StringBuilder();
        for (int i = box[0].length() - 1; i >= 0; i--) {
            invertedString.append(box[0].charAt(i));
        }

        return invertedString.toString();
    }

}
