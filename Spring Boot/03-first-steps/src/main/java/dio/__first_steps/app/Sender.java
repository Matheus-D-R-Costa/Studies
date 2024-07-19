package dio.__first_steps.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "sender")
public class Sender {

    private String name;
    private String email;
    private List<Long> telephones;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<Long> telephones) {
        this.telephones = telephones;
    }
}
