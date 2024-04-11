package aula15;

import java.util.Scanner;

public class showDatas {

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

class Bank {

    private int salary;

    public int getSalary(int timeService, char qualifications, char sex) {

        if (sex == 'M') {
            if (timeService >= 10 ) {
                if (qualifications == 'P') {
                    salary = 15000;
                } else {
                    salary = 10000;
                }
            } else {
                if (qualifications == 'P') {
                    salary = 10000;
                } else {
                    salary = 7000;
                }
            }
        } else if (sex == 'F') {
            if (timeService >= 10) {
                if (qualifications == 'P') {
                    salary = 15500;
                } else {
                    salary = 10500;
                }
            } else {
                if (qualifications == 'P') {
                    salary = 10500;
                } else {
                    salary = 7500;
                }
            }
        } else {
            System.out.println("Por favor, insira 'macho' ou 'fêmea' como valor.");
        }

        return salary;
    }
}

class People {

    private int timeService;
    private char qualifications;
    private char sex;

    public int getTimeService() {
        return timeService;
    }

    public void setTimeService(int timeService) {
        this.timeService = timeService;
    }

    public char getQualifications() {
        return qualifications;
    }

    public void setQualifications(char qualifications) {
        this.qualifications = qualifications;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
