package edu.dio.aulas.pilares.messageService.service;

import edu.dio.aulas.pilares.messageService.model.MessageApp;

public class FacebookService extends MessageApp {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
        salvarHistoricoMensagem();
    }
}
