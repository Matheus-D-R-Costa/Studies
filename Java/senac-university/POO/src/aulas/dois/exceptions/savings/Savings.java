package aulas.dois.exceptions.savings;

public class Savings {

    private double money;
    private final double INTEREST = 0.70;

    public Savings(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getYield(int numberOfMonths) {
        return money * Math.pow(1 + INTEREST / 100, numberOfMonths);
    }
}
