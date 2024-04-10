package aula14;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] days = {"Domingo", "Segunda", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sabado"};
        System.out.println("Digite um numero");
        int choosedDays = sc.nextInt();
        try {
            System.out.println(days[choosedDays]);
        } catch (Exception e) {
            System.out.println("Digite um valor de 0 a 6 otário!");
        }
    }
}
