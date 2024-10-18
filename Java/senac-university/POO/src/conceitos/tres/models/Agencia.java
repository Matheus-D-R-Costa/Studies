package conceitos.tres.models;

public class Agencia {

    private Integer numero;

    public void imprimir() {
        System.out.println(getNumero());
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
