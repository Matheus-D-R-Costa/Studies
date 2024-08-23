import models.company.Company;
import models.company.impl.GameDevCompany;
import models.employee.Employee;
import models.employee.impl.Designer;
import models.employee.impl.Programmer;
import models.employee.impl.Tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee designer = new Designer();
        Employee programmer = new Programmer();
        Employee tester = new Tester();

        List<Employee> employees = new ArrayList<>(Arrays.asList(designer, programmer, tester));

        Company gameCompany = new GameDevCompany(employees);

        gameCompany.createSoftware();

    }
}
