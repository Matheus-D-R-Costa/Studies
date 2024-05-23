package edu.dio.aulas.testes.random.challenges;


import java.util.Arrays;
import java.util.Scanner;

public class WordFinder {

    static Scanner scanner = new Scanner(System.in);
    static String anagram;
    static String option;
    static String word = "";
    static String[] words;
    static char[] anagramBox;
    static char[] charsOfWordInAlphabeticalOrder;


    public static void main(String[] args) {

        System.out.println("Digite o anagrama desejado.");
        anagram = scanner.nextLine();
        words = new String[anagram.length()];

        while (true) {
            System.out.println("Voce deseja encontrar alguma palavra nesse anagrama? (S/N)");
            option = scanner.next().toLowerCase();

            switch (option) {
                case "s":
                    System.out.println("Digite a palavra que desejas procurar.");
                    word = scanner.next();
                    charsOfWordInAlphabeticalOrder = word.toCharArray();
                    Arrays.sort(charsOfWordInAlphabeticalOrder);

                    String wordInAlphabeticOrder = "";
                    for (int i = 0; i < word.length(); i++) {
                        wordInAlphabeticOrder += charsOfWordInAlphabeticalOrder[i];

                    }

                    System.out.println(wordInAlphabeticOrder);

                    words = wordInAlphabeticOrder.split(",");
                    System.out.println(Arrays.toString(words));
                    finder(anagram, words);
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

        anagramBox = anagram.toCharArray();
        Arrays.sort(anagramBox);


//        for (int i = 0; i < anagram.length(); i++) {
//
//        }

        System.out.println(anagramBox);

        return false;
    }
}
