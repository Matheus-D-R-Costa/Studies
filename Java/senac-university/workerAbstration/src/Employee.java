public abstract class Employee {

    private Double salary;

    public Employee(Double salary) {
        this.salary = salary;
    }

    public abstract Double calculateSalary();

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
