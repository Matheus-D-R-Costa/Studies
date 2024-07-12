package edu.dio.aulas.testes.random.challenges;

import java.util.ArrayList;
import java.util.List;

public class Payroll {

    static class Employee {
        String name;
        double grossSalary;
        double netSalary;
        double incomeTax;
        double socialSecurity;
        double healthInsurance;

        Employee(String name, double grossSalary) {
            this.name = name;
            this.grossSalary = grossSalary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Peter", 5000.00));
        employees.add(new Employee("Lucas", 3000.00));
        employees.add(new Employee("Maria", 7000.00));
        employees.add(new Employee("Gustavo", 11350.00));
        employees.add(new Employee("Joana", 700.00));

        double totalPayroll = 0.0;
        double totalIncomeTax = 0.0;
        double totalSocialSecurity = 0.0;
        double totalHealthInsurance = 0.0;

        for (Employee employee : employees) {
            calculateDeductions(employee);
            totalPayroll += employee.netSalary;
            totalIncomeTax += employee.incomeTax;
            totalSocialSecurity += employee.socialSecurity;
            totalHealthInsurance += employee.healthInsurance;
        }

        System.out.println("Valor total da folha de pagamento: " + totalPayroll);
        for (Employee employee : employees) {
            System.out.println("Salário líquido de " + employee.name + ": " + employee.netSalary);
        }
        System.out.println("Valor total do imposto de renda: " + totalIncomeTax);
        System.out.println("Dinheiro direcionado ao governo: " + (totalIncomeTax + totalSocialSecurity + totalHealthInsurance));
    }


    public static void calculateDeductions(Employee employee) {
        employee.incomeTax = calculateIncomeTax(employee.grossSalary);
        employee.socialSecurity = calculateSocialSecurity(employee.grossSalary);
        employee.healthInsurance = 100.00;
        employee.netSalary = employee.grossSalary - (employee.incomeTax + employee.socialSecurity + employee.healthInsurance);
    }

    private static double calculateIncomeTax(double grossSalary) {
        if (grossSalary <= 1903.98) {
            return 0.0;
        } else if (grossSalary <= 2826.65) {
            return grossSalary * 0.075;
        } else if (grossSalary <= 3751.05) {
            return grossSalary * 0.15;
        } else if (grossSalary <= 4664.68) {
            return grossSalary * 0.225;
        } else {
            return grossSalary * 0.275;
        }
    }

    private static double calculateSocialSecurity(double grossSalary) {
        if (grossSalary <= 1693.72) {
            return grossSalary * 0.08;
        } else if (grossSalary <= 2822.90) {
            return grossSalary * 0.09;
        } else if (grossSalary <= 5645.80) {
            return grossSalary * 0.11;
        } else {
            return 621.04;
        }

    }
}