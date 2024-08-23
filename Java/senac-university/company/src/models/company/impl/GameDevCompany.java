package models.company.impl;

import models.employee.Employee;
import models.company.Company;

import java.util.List;

public class GameDevCompany extends Company {

    public GameDevCompany(List<Employee> employees) {
        super(employees);
    }
}
