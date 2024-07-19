package dio.__first_steps;

import java.util.List;

import dio.__first_steps.model.User;
import dio.__first_steps.model.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class startApp implements CommandLineRunner {

    private UserRepository repository;

    public startApp(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<User> users = repository.findByNameContaining("Matheus");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
