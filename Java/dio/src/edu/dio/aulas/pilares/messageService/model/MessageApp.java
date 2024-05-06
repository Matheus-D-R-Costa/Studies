package edu.dio.aulas.pilares.messageService.model;

public abstract class MessageApp {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
