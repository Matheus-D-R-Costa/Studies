package dio.__first_steps;

import dio.__first_steps.app.MessageSystem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner run(MessageSystem system) throws Exception {
		return args -> {
			system.sendSignUpConfirmation();
			system.sendWelcomeMessage();
			system.sendSignUpConfirmation();
		};
	}

}
