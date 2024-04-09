package aula06;

import java.util.Scanner;

public class commission {
    static double finalWage;
    static double sallies;
    static double tax;
    static double percent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu salário fixo?");
        double wage = sc.nextDouble();
        System.out.println("Qual a comissão?");
        double commission = sc.nextDouble();
        System.out.println("Qual a taxa de imposto?");
        tax = sc.nextDouble();

        percent = (tax / 100);

        sallies = wage + commission;

        double calculateTax = sallies * percent;

        finalWage = sallies - calculateTax;

        System.out.println("Salário base: " + wage +
                "\n valor total em vendas" + sallies +
                "\ntaxa de comissão: " + tax +
                "\nvalor de comissão recebida: " + commission +
                "\nSalário final: " + finalWage);
    }
}
