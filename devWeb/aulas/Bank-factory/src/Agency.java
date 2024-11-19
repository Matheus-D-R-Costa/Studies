import java.util.Set;

public abstract class Agency {

    private String number;
    private Bank bank;

    public Agency(String number, Bank bank) {
        this.number = number;
        this.bank = bank;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
