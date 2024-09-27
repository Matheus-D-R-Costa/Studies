package aulas.nove.atv01;

public class Calculator {

    private Calculator(){}

    public static double sum(double n1, double n2) {
        return n1 + n2;
    }

    public static double divide(double n1, double n2) {
        return n1 / n2;
    }

    public static double multiply(double n1, double n2) {
        return n1 * n2;
    }

    public static double subtract(double n1, double n2) {
        return n1 - n2;
    }

    public static boolean isMajor(double n1, double n2) {
        return n1 > n2;
    }

}
