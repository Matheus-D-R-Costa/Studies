package edu.senac.intro.aulas.quinze.model;

public class Bank {

    private int salary;

    public int getSalary(int timeService, char qualifications, char sex) {

        if (sex == 'M') {
            if (timeService >= 10) {
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
