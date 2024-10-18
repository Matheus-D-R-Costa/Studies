package conceitos.tres.models;

public class Conta {

    private String numero;
    private Double saldo;
    private Double acumuladorImposto;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0d;
        this.acumuladorImposto = 0d;
    }

    public void depositar(Double valor) {
        if (valor == 0 || valor < 0) throw new IllegalArgumentException("Valor a ser depositado é inválido!");
        this.saldo += valor;
    }

    public void sacar(Double valor) {
        if (valor > this.saldo || valor < 0) throw new IllegalArgumentException("Valor a ser inserido é inválido!");
        this.saldo -= valor;
        acumularImposto(valor);
    }

    public void acumularImposto(Double valor) {
        this.acumuladorImposto += 0.35 * valor;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getAcumuladorImposto() {
        return acumuladorImposto;
    }
}
