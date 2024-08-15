package conceitos.um;

public class BankAccount {

    private String owner;
    private double founds;

    public BankAccount(String owner, double founds) {
        setOwner(owner);
        setFounds(founds);
    }

    public void deposit(double amount) {

        this.founds += amount;
    }

    public void withdraw(double amount) {
        if (isNegative(amount) || amount == 0 || amount > founds) {
            throw new IllegalArgumentException("Valor não permitdo pelo sistema, tente novamente!");
        }

        this.founds -= amount;

    }

    public boolean existsFounds() {
        return founds >= 0;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (owner.length() < 2) {
            throw new IllegalArgumentException("O nome do usuário não pode conter menos que dois caracteres!");
        }

        this.owner = owner;
    }

    public double getFounds() {
        return founds;
    }

    public void setFounds(double founds) {
        if (isNegative(founds) || founds == 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo ou zero!");
        }

        this.founds = founds;

    }

    private boolean isNegative(double value) {
        String valueInStr = Double.toString(value);
        return valueInStr.charAt(0) == ('-');
    }

}
