package conceitos.tres.models;

public class Lancamento {

    private String descricao;
    private Double valor;
    private Boolean pago;

    public Lancamento(String descricao) {
        this.descricao = descricao;
        this.pago = false;
    }

    public boolean isPago() {
        return this.pago;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }
}
