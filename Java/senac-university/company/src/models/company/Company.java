package models.company;

import models.employee.Employee;

import java.util.List;

public abstract class Company {

    List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public void createSoftware() {
        for (Employee employee : employees) {
            employee.doWork();
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
