package edu.senac.intro.aulas.vinteseis;

import java.util.Locale;
import java.util.Scanner;

public class ImcRefactoring {

    static Scanner scanner = new Scanner(System.in);
    static double idealWeight;
    static char sex;
    static double height;

    public static void main(String[] args) {

        System.out.println("Digite sexo:");
        sex = scanner.next().toUpperCase(Locale.ROOT).charAt(0);

        System.out.println("Digite altura:");
        height = scanner.nextDouble();

        calculateImc(sex, height);

    }

    static void calculateImc(char sex, double height) {

        if (sex == 'M') {
            idealWeight = (72.7 * height) - 58;
        } else {
            idealWeight = (62.1 * height) - 44;
        }

        showDoubleData(idealWeight);

    }

    private static void showDoubleData(double data) {
        System.out.println(data);
    }
}
