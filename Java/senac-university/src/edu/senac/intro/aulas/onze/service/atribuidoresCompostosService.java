package edu.senac.intro.aulas.onze.service;

import java.util.Scanner;

public class atribuidoresCompostosService {

    public static void transformAlgorithmToCompostOperators () {
        int result = 1;

        result += 2;
        System.out.println(result);

        result--;
        System.out.println(result);

        result = result * result;
        System.out.println(result);

        result -= 2;
        System.out.println(result);

        result += 8;
        result %= 7;
        System.out.println(result);
    }

    public static void imparOuPar () {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");

        double number = (sc.nextDouble());

        number %= 2;

        System.out.println((number ==  0)? "Número par" : "Número Impar");
    }

    public static void criarPessoa () {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String fullName = sc.nextLine();

        System.out.println("Digite sua idade");
        int age = new Scanner(System.in).nextInt();

        System.out.println("Qual sua altura?");
        double height = new Scanner(System.in).nextDouble();

        System.out.println("Qual seu peso?");
        double weight = new Scanner(System.in).nextDouble();

        System.out.println("Qual seu email? ");
        String email = new Scanner(System.in).next();

        System.out.println("Qual seu endereço?");
        String address = new Scanner(System.in).nextLine();

        System.out.print("Nome: " + fullName +
                "Idade: " + age +
                " Altura: " + height + "Cm " +
                "Peso: " + weight + "Kg " +
                "Email: " + email +
                "Endereço: " + address);

    }
}

