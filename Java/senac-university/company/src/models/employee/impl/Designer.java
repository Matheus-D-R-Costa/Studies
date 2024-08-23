package models.employee.impl;

import models.employee.Employee;

public class Designer implements Employee {

    @Override
    public void doWork() {
        System.out.println("Fazendo o UI do sistema");
    }
}
