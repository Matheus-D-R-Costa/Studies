package edu.dio.aulas.visibilidade.lanchonete;

import edu.dio.aulas.visibilidade.lanchonete.area.cliente.Cliente;
import edu.dio.aulas.visibilidade.lanchonete.atendimento.Atendente;
import edu.dio.aulas.visibilidade.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {

    static Cozinheiro cozinheiro = new Cozinheiro();
    static Atendente atendente = new Atendente();
    static Cliente cliente = new Cliente();

    public static void main(String[] args) {

        cozinheiro.adicionarComboNoBalcao();

        atendente.servindoMesa();
        atendente.receberPagamento();

        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }
}