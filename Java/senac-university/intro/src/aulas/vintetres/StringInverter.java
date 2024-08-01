package edu.senac.intro.aulas.vintetres;


import java.util.Scanner;

public class StringInverter {

    static Scanner scanner = new Scanner(System.in);
    static String word;
    static String[] boxOfInvertedWords;
    static String invertedString = "";

    public static void main(String[] args) {

        System.out.println("Digite a palavra que o senhor deseja inverter.");
        word = scanner.nextLine();
        boxOfInvertedWords = new String[]{word};

       for (int index = boxOfInvertedWords[0].length() - 1; index >= 0; index--) {
           invertedString += boxOfInvertedWords[0].charAt(index);
       }

        System.out.println(invertedString);

    }
}