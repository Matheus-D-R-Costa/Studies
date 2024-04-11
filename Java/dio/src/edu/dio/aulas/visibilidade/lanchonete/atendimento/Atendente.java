package edu.dio.aulas.visibilidade.lanchonete.atendimento;

public class Atendente {
    public void servindoMesa() {
        pegarLancheBalcao();
        System.out.println("SERVINDO A MESA");
    }
    private void pegarLancheBalcao() {
        System.out.println("PEGANDO O LANCHE NO BALCÃO");
    }
    public void receberPagamento() {
        System.out.println("RECEBENDO PAGAMENTO");
    }
}


