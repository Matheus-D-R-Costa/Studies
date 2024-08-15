package edu.dio.aulas.ordenacao.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EXCS02 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        fillList(names);
        System.out.println(names);

        names.sort(String::compareTo);
        System.out.println(names);

    }

    public static void fillList(List<String> list) {
        System.out.println("Quantos nomes você quer adicionar?");
        int numberOfNames = scanner.nextInt();

        for (int i = 0; i < numberOfNames; i++) {
            System.out.println("Digite um número inteiro para o índice " + (i + 1) + ":");
            list.add(scanner.next());
        }
    }
}
