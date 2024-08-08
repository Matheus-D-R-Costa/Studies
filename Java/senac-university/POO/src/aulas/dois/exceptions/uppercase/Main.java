package aulas.dois.exceptions.uppercase;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra!");
        String word = scanner.next();

        try {
            Integer.parseInt(word);
            System.out.println("Entrada Inválida.");
        } catch (NumberFormatException e1) {

            try {
                Double.parseDouble(word);
                System.out.println("Entrada Inválida.");
            } catch (NumberFormatException e2) {
                System.out.println(word.toUpperCase());
            }

        }

    }

}
