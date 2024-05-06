package edu.dio.aulas.pilares.messageService;

import edu.dio.aulas.pilares.messageService.model.MessageApp;
import edu.dio.aulas.pilares.messageService.service.FacebookService;
import edu.dio.aulas.pilares.messageService.service.MSNService;
import edu.dio.aulas.pilares.messageService.service.TelegramService;

import java.util.Scanner;

public class Desktop {

    static Scanner scanner = new Scanner(System.in);
    static MessageApp messageApp = null;

    public static void main(String[] args) {

        System.out.println("Você deseja enviar mensagem por qual app?");
        String app = scanner.next().toLowerCase();

        switch (app) {

            case "msn", "msnmessenger" :
                messageApp = new MSNService();
                break;
            case "face", "facebook" :
                messageApp = new FacebookService();
                break;
            case "tl", "tele", "telegram" :
                messageApp = new TelegramService();
                break;
            default:
                System.out.println("Verifique se vc digitou o nome de um app existente no sistema.");
        }

        messageApp.enviarMensagem();
        messageApp.receberMensagem();
    }
}
