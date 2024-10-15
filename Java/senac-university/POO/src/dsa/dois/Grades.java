package dsa.dois;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Grades {

    public static void main(String[] args) {
        int[] grades = new int[5];
        grades[0] = 7;
        grades[1] = 8;
        grades[2] = 9;
        grades[3] = 6;
        grades[4] = 10;

        printGrades(grades);

        OptionalDouble opAverageGrade = Arrays.stream(grades).average();
        System.out.println(opAverageGrade.orElse(0));
    }

    private static void printGrades(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Aluno N" + i + " Nota = " + grades[i]);
        }
    }

}
