package edu.dio.aulas.testes.random.challenges;


import java.util.Arrays;
import java.util.Scanner;

public class WordFinder {

    static Scanner scanner = new Scanner(System.in);
    static String anagram;
    static String option;
    static String word;

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
                    finder(anagram, word);
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

    public static boolean finder(String anagram, String word) {
        char[] charsOfAnagramInAlphabeticalOrder = anagram.toCharArray();
        char[] charsOfWordInAlphabeticalOrder = word.toCharArray();

        String product = "";

        for (int i = 0; i < charsOfAnagramInAlphabeticalOrder.length; i++) {
            for (int j = 0; j < charsOfWordInAlphabeticalOrder.length; j++) {
                if (charsOfAnagramInAlphabeticalOrder[i] == charsOfWordInAlphabeticalOrder[j]) {
                    product += charsOfAnagramInAlphabeticalOrder[i];
                    charsOfWordInAlphabeticalOrder[j] = ' ';
                }
            }
        }

        char[] charsOfProductInAlphabeticalOrder = product.toCharArray();
        Arrays.sort(charsOfProductInAlphabeticalOrder);

        charsOfWordInAlphabeticalOrder = word.toCharArray();
        Arrays.sort(charsOfWordInAlphabeticalOrder);

        System.out.println(Arrays.toString(charsOfProductInAlphabeticalOrder));
        System.out.println(Arrays.toString(charsOfWordInAlphabeticalOrder));

        return Arrays.equals(charsOfProductInAlphabeticalOrder, charsOfWordInAlphabeticalOrder);
    }
}
