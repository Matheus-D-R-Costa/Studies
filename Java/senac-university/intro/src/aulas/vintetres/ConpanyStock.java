package edu.senac.intro.aulas.vintetres;

import java.util.Scanner;

public class ConpanyStock {

    static Scanner scanner = new Scanner(System.in);
    static String option = "";
    static int arraySize;
    static int closet = 0;

    public static void main(String[] args) {

        System.out.println("Digite o tamanho do Estoque Solicitado.");
        arraySize = scanner.nextInt();

        String[] products = new String[arraySize];

        while (true) {

            System.out.println("1) Armazenar Produtos No Estoque.");
            System.out.println("2) Verificar Estoque.");
            System.out.println("3) Consultar Estoque.");
            System.out.println("4) Alterar Tamanho Do Estoque");
            System.out.println("5) Sair");

            option = scanner.next();

            switch (option) {

                case "1":

                    for (int i = 0; i < arraySize; i++) {
                        System.out.println("Digite O Nome Do produto.");
                        String productName = scanner.next().toUpperCase();
                        products[i] = productName;
                    }

                    System.out.println("Produtos Adicionados.");

                    break;

                case "2":

                    System.out.println("---------------");
                    System.out.println("Estoque");
                    System.out.println("---------------");

                    for (String product : products) {
                        System.out.println(product);
                    }

                    System.out.println("===============");

                    break;

                case "3":

                    System.out.println("Digite O Nome Do Produto a ser consultado.");
                    String productConsulted = scanner.next().toUpperCase();

                    for (String product : products) {

                        if (product.equals(productConsulted)) {
                            System.out.println("Produto " + productConsulted + " Existe No Armário " + ++closet);
                            break;
                        } else {
                            System.out.println("Nada Encotrado No Armário " + ++closet);
                        }
                    }

                    break;

                case "5":
                    System.out.println("Aplicação Encerrada.");
                    System.exit(10);
                    break;

            }
        }

    }
}
