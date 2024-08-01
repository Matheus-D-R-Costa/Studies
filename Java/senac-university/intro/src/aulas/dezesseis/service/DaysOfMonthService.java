package edu.senac.intro.aulas.dezesseis.service;

import java.util.Scanner;

public class DaysOfMonthService {

    static String month;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("");

        System.out.println("Qual mês o senhor deseja saber a quantidade de meses?");
        month = scanner.nextLine().toLowerCase();

        setMonth(month);
    }

    public static void setMonth(String month) {

        switch (month) {

            case "fevereiro": {
                System.out.println("O mês " + month + " tem 29 dias");
                break;
            }
            case "abril", "junho", "setembro", "novembro": {
                System.out.println("O mês " + month + " tem 30 dias");
                break;
            }
            case "janeiro", "março", "maio", "julho", "agosto", "outubro", "dezembro": {
                System.out.println("O mês " + month + " tem 31 dias");
                break;
            }
            default:
                System.out.println("Insira um mês válido.");
        }
    }
}