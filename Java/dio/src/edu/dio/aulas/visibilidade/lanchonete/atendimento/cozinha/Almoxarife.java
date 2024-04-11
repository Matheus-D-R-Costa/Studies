package edu.dio.aulas.visibilidade.lanchonete.atendimento.cozinha;

public class Almoxarife {
    void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarEntrada();
    }
    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }
    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GÁS");
        controlarSaida();
    }
    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }
}
