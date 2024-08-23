package models.employee.impl;

import models.employee.Employee;

public class Tester implements Employee {

    @Override
    public void doWork() {
        System.out.println("Testando o Software.");
    }

}
