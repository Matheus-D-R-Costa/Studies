package edu.senac.intro.aulas.vinte;

public class Reader {

    static int number = 0;

    public static void main(String[] args) {

        while (number++ < 100) {
            if (number % 2 == 1) {
                System.out.println(number);
            }
        }
    }
}
