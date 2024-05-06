package edu.dio.aulas.pilares.messageService.service;

import edu.dio.aulas.pilares.messageService.model.MessageApp;

public class TelegramService extends MessageApp {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }
}
