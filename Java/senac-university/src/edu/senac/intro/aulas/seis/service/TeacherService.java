package edu.senac.intro.aulas.seis.service;

import java.util.Scanner;

public class TeacherService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu salário?");
        Float wage = sc.nextFloat();

        System.out.println("Você fez trabalho extra? se sim, quantas horas você trabalhou?");
        Double extraHour = sc.nextDouble(),
                clt = 8D,
                valueHourWage = wage / clt,
                valueExtraHour = valueHourWage * 1.5,
                totalBonus = extraHour * valueExtraHour,
                totalWage = totalBonus + wage;
        System.out.println("\nSeu salário: " + wage + " Reais." +
                "\nregime clt: " + clt + " Horas de trabalho." +
                "\nSua hora de trabalho vale: " + valueHourWage + " Reais." +
                "\nVocê trabalhou: " + extraHour + " extras hoje." +
                "\nCada hora extra sua vale: " + valueExtraHour + " Reais." +
                "\nSeu salário total é de: " + totalWage + " Reais.");
    }
}
