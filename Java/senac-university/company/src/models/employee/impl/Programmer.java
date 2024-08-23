package models.employee.impl;

import models.employee.Employee;

public class Programmer implements Employee {

    @Override
    public void doWork() {
        System.out.println("Programando o sistema.");
    }
}
