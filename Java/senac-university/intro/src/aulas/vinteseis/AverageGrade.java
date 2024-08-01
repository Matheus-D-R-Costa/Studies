package edu.senac.intro.aulas.vinteseis;

import java.util.Scanner;

public class AverageGrade {

    static Scanner scanner = new Scanner(System.in);
    static double[] grades = new double[5];

    public static void main(String[] args) {

        grades = new double[]{5, 7, 8, -10, 7};

        calculateSchoolAverage(grades);

    }

    static void calculateSchoolAverage(double[] grades) {
        double finalGrade = 0;

        for (double grade : grades) {
            finalGrade += grade;
        }

        finalGrade = finalGrade / grades.length;

        checkGrade(finalGrade);

    }

    private static void checkGrade(double finalGrade) {

        if (finalGrade < 6) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
    }
}
