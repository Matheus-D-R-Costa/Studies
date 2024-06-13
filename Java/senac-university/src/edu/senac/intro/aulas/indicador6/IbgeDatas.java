package edu.senac.intro.aulas.indicador6;

import java.util.Scanner;

// Integrantes: Carlos, Fábio dos Santos, Gabriel, Matheus.

public class IbgeDatas {

    static Scanner scanner = new Scanner(System.in);
    static String[][] cpfs = new String[10][];

    static int personsWithoutSon = 0;
    static int personWithSon = 0;
    static int quantityOfSons = 0;
    static double averageSons = 0;

    public static void main(String[] args) {
        fillCpfs(cpfs);

        System.out.println("Pessoas com filhos: " + personWithSon);
        System.out.println("Pessoas sem filhos: " + personsWithoutSon);
        System.out.println("Quantidade de filhos ao total: " + quantityOfSons);
        System.out.println("Média de filhos por pessoa: " + (averageSons));
    }

    static void fillCpfs(String[][] cpfs) {

        for (int i = 0; i < cpfs.length; i++) {
            cpfs[i] = new String[1];
            cpfs[i][0] = "";
        }

        for (int i = 0; i < cpfs.length; i++) {
            String cpf;

            while (true) {
                System.out.println("Diga o cpf " + (i + 1));
                cpf = scanner.next();

                if (validatecpf(cpf, cpfs)) {
                    break;
                }
            }

            System.out.println("Quantos filhos " + cpf + " tem? (se não ter filhos coloque 0). ");
            int filhos = scanner.nextInt();

            if (filhos == 0) {
                personsWithoutSon++;
            } else {
                personWithSon++;
                quantityOfSons += filhos;
            }

            cpfs[i] = new String[filhos + 1];

            cpfs[i][0] = cpf;

            for (int j = 1; j < filhos + 1; j++) {
                System.out.println("Diga o nome do filho " + j);

                String nomeFilho = scanner.next();

                System.out.println("Diga o ultimo nome do filho " + nomeFilho);
                String lastNameSon = scanner.next();

                cpfs[i][j] = nomeFilho + lastNameSon;

            }

            if (personWithSon != 0) {
                averageSons = quantityOfSons / personWithSon;
            }

        }

    }

    private static boolean validatecpf(String cpf, String[][] cpfs) {
        for (String[] strings : cpfs) {
            for (int i = 0; i < strings.length; i++)
                if (strings[i].equals(cpf)) {
                    System.out.println("CPF já cadastrado. Por favor digite outro.");
                    return false;
                } else {
                    return true;
                }
        }

        return true;

    }

}




