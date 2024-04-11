package edu.senac.intro.aulas.quinze.service;

import edu.senac.intro.aulas.quinze.model.Bank;
import edu.senac.intro.aulas.quinze.model.People;

import java.util.Scanner;

public class showDatasService {

    static People people_01 = new People();
    static Bank bank_01 = new Bank();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int index = 1; index <= 3; index++) {
            switch (index) {
                case 1:
                    System.out.println("Quantos anos você presta serviço na empresa Jamelão bank?");
                    int timeService = scanner.nextInt();
                    people_01.setTimeService(timeService);
                    break;
                case 2:
                    System.out.println("Você é graduado ou pós-graduado? (G/P)");
                    char qualification = scanner.next().toUpperCase().charAt(0);
                    people_01.setQualifications(qualification);
                    break;
                case 3:
                    System.out.println("Você é macho ou fêmea? (M/F)");
                    char sex = scanner.next().toUpperCase().charAt(0);
                    people_01.setSex(sex);
                    break;
            }
        }

        int salary = bank_01.getSalary(people_01.getTimeService(), people_01.getQualifications(), people_01.getSex());
        System.out.println("O salário é: " + salary);
    }
}

