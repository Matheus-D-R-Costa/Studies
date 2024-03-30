package aula06;

import java.util.Scanner;

public class Name {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira Seu Nome");
        String name = sc.nextLine();
        System.out.println("Insira e sobrenome");
        String sobrenome = sc.nextLine();
        System.out.println(name);
        System.out.println(sobrenome);
    }
}
