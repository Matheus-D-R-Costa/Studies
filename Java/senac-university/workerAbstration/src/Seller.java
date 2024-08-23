public class Seller extends Employee{

    private Double commission;

    public Seller(Double salary, Double commission) {
        super(salary);
        this.commission = commission;
    }

    @Override
    public Double calculateSalary() {
        return getSalary() * getCommission();
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }
}
