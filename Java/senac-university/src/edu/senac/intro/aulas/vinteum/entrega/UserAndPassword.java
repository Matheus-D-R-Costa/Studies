package edu.senac.intro.aulas.vinteum.entrega;

import java.util.Scanner;

public class UserAndPassword {

    static Scanner scanner = new Scanner(System.in);

    static String name;
    static String password;
    static boolean nameEqualsPassword = false;

    public static void main(String[] args) {

        do {

            System.out.println("Cadastre um nome");
            name = scanner.next();

            System.out.println("Cadastre uma senha");
            password = scanner.next();

            if (name.equals(password)) {
                nameEqualsPassword = true;
                System.out.println("Digite uma senha diferente do usuário");
            }else{
                nameEqualsPassword = false;
                System.out.println("Usuário cadastrado");
            }

        } while (nameEqualsPassword);
    }
}
