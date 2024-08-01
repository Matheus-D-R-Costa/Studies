package edu.senac.intro.aulas.vintesete;

import java.util.Arrays;
import java.util.Scanner;

public class Class {

    static Scanner scanner = new Scanner(System.in);
    static String[] students = new String[6];

    public static void main(String[] args) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Digite o nome do aluno na carteira " + (i + 1));
            students[i] = scanner.next();
        }

        printClass(students);
        orderClass(students);
        printClass(students);

    }

    public static void orderClass(String[] classToOrder) {
        Arrays.sort(classToOrder);
    }

    public static void printClass(String[] classToPrint) {
        System.out.println(Arrays.toString(classToPrint));
    }

}
