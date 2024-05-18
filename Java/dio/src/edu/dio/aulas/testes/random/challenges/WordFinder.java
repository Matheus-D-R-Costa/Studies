package edu.dio.aulas.testes.random.challenges;

import java.util.Locale;
import java.util.Scanner;

public class WordFinder {

    static Scanner scanner = new Scanner(System.in);
    static String anagram;
    static String option;
    static String word;
    static String[] words;

    public static void main(String[] args) {

        System.out.println("Digite o anagrama desejado.");
        anagram = scanner.nextLine();

        while (true) {
            System.out.println("Voce deseja encontrar alguma palavra nesse anagrama? (S/N)");
            option = scanner.next().toLowerCase();

            switch (option) {
                case "s":
                    System.out.println("Digite a palavra que desejas procurar.");
                    word = scanner.next();
                    words = new String[]{word};
                    break;

                case "n":
                    System.out.println("Obrigado por usar a aplicação.");
                    System.exit(10);
                    break;

                default:
                    System.out.println("Opção inexistente. Tente novamente com (S/N)");
                    break;
            }

        }


    }

    public static boolean finder(String anagram, String[] words) {

    }
}
