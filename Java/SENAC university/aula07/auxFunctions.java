package aula07;

import java.util.Scanner;

public class auxFunctions {
    public static void calculateNewPrice() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do produto?");
        String name = sc.nextLine();

        System.out.println("Qual o preço atual?");
        double price = sc.nextDouble();
        double newPrice = price * 1.65;
        System.out.println("Um valor de: " + newPrice + " foi atribuido ao produto " + name);
    }

    public static void calculateImc(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu peso?");
        double weight = sc.nextDouble();

        System.out.println("Qual a sua altura?");
        double height = sc.nextDouble(),

        imc = weight / (height * 10);

        System.out.println("Seu IMC é de: " + imc);
    }

    public static void calcGrade(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga o primeiro número?");
        double nota1 = sc.nextDouble();

        System.out.println("Diga o segundo número?");
        double nota2 = sc.nextDouble();

        System.out.println("Diga o terceiro número?");
        double nota3 = sc.nextDouble(),

        grade = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua média é de: " + grade);
    }
}
