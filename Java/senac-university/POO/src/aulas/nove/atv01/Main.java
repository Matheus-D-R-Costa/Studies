package aulas.nove.atv01;

public class Main {

    public static void main(String[] args) {
        Calculator calculator01 = Calculator.getInstance();
        calculator01.sum(40, 25);
        calculator01.subtract(30, 25);
        calculator01.divide(100, 6);
        calculator01.multiply(40, 2);

        Calculator calculator02 = Calculator.getInstance();
        System.out.println(calculator02.getHistory());

        Calculator calculator03 = Calculator.getInstance();
        System.out.println(calculator03.getHistory());

    }
}
