package aula15;

import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] grades = new double[5];
        double finalNote = 0;
        for (int index = 0; index < 5; index++) {
            switch (index) {
                case 0:
                    System.out.println("Qual foi sua nota de Fisica?");
                    break;
                case 1:
                    System.out.println("Qual foi sua nota de Quimica?");
                    break;
                case 2:
                    System.out.println("Qual foi sua nota em Matematica");
                    break;
                case 3:
                    System.out.println("Qual foi sua nota em Informatica?");
                    break;
                case 4:
                    System.out.println("Qual foi sua nota em Biologia?");
            }
            grades[index] = sc.nextDouble();
            finalNote += grades[index] / grades.length;
        }
        if (finalNote < 4) {
            System.out.println("Conceito Medonho");
        } else if (finalNote <= 6) {
            System.out.println("Conceito Insátisfatorio");
        } else if (finalNote <= 7) {
            System.out.println("Conceito Regular");
        } else if (finalNote <= 8) {
            System.out.println("Conceito Satisfatório");
        } else if (finalNote >= 8 && finalNote <= 10) {
            System.out.println("Conceito Bom");
        } else {
            System.out.println("Por favor, insira novamente suas notas");
        }
    }
}
