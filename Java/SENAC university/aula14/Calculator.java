package aula14;

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
        if (finalNote < 40) {
            System.out.println("Conceito Medonho");
    }

}
