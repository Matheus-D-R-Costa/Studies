package edu.dio.aulas.recursao;

public class Tail {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int number) {
        return number == 0 ? 1 : number * factorial(number - 1);
    }

}
