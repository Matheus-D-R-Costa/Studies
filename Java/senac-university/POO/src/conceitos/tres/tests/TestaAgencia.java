package conceitos.tres.tests;

import conceitos.tres.models.Agencia;

import java.util.Scanner;

public class TestaAgencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Agencia agencia01 = new Agencia();
        Agencia agencia02 = new Agencia();


        System.out.println("Digite um número para a agência...");
        agencia01.setNumero(scanner.nextInt());

        System.out.println("Digite outro número para outra agência...");
        agencia02.setNumero(scanner.nextInt());

        agencia01.imprimir();
        agencia02.imprimir();


    }

}
