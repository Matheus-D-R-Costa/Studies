package dio.__first_steps.app;

import org.springframework.stereotype.Component;

@Component
public class MessageSystem {

    private Sender noreply;
    private Sender techTeam;

    public MessageSystem(Sender noreply, Sender techTeam) {
        this.noreply = noreply;
        this.techTeam = techTeam;
    }

    public void sendSignUpConfirmation() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void sendWelcomeMessage() {
        techTeam.setEmail("Tech@dio.com.br");
        System.out.println(techTeam);
        System.out.println("Bem-vindo à Tech Elite");
    }

}
