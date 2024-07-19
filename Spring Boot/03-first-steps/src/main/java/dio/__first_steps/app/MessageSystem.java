package dio.__first_steps.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageSystem implements CommandLineRunner {

    private Sender sender;

    public MessageSystem(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + sender.getName()
                + "\nE-mail: " + sender.getEmail()
                + "\nCom telefones para contato: " + sender.getTelephones());

        System.out.println("Seu cadastro foi aprovado");
    }
}
