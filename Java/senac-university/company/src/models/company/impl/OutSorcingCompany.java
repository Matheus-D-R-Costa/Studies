package models.company.impl;

import models.employee.Employee;
import models.company.Company;

import java.util.List;

public class OutSorcingCompany extends Company {

    public OutSorcingCompany(List<Employee> employees) {
        super(employees);
    }
}
