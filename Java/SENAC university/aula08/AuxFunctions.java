package aula08;

import java.util.Scanner;

public class AuxFunctions {

    public static void calculateImc() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu gênero?");
        String gender = sc.nextLine();

        System.out.println("Qual seu peso?");
        double weight = sc.nextDouble();

        System.out.println("Qual a sua altura?");
        double height = sc.nextDouble();

        double imc = weight / (height * height);

        if (gender.startsWith("m") || gender.startsWith("M")) {
            if (imc < 20) {
                System.out.println("Voce esta abaixo do peso, seu IMC é de: " + imc);
            } else if (imc >= 20 && imc < 25) {
                System.out.println("Voce esta na faixa de peso ideal, seu IMC é de: " + imc);
            } else if (imc >= 25 && imc < 28) {
                System.out.println("Voce esta com obesidade de Grau 1, seu IMC é de: " + imc);
            } else if (imc >= 28 && imc < 40) {
                System.out.println("Voce esta com obesidade de Grau 2, seu IMC é de: " + imc);
            } else if (imc >= 40) {
                System.out.println("Voce esta com obesidade de Grau 3, seu IMC é de: " + imc);
            } else {
                System.out.println("Peso inserido é um número inválido");
            }

        } else if (gender.startsWith("f") || gender.startsWith("F")) {
            if (imc < 18.5) {
                System.out.println("Voce esta abaixo do peso, seu IMC é de: " + imc);
            } else if (imc >= 18.5 && imc < 24.9) {
                System.out.println("Voce esta na faixa de peso ideal, seu IMC é de: " + imc);
            } else if (imc >= 24.9 && imc < 30) {
                System.out.println("Voce esta com obesidade de Grau 1, seu IMC é de: " + imc);
            } else if (imc >= 30) {
                System.out.println("Voce esta com obesidade de Grau 3, seu IMC é de: " + imc);
            } else {
                System.out.println("Peso inserido é um número inválido");
            }
        } else {
            System.out.println("Gênero é masculino ou feminino.");
        }
    }
}
