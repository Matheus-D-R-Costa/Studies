package com.example.aula10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Aula10Application {

    public static void main(String[] args) {
        SpringApplication.run(Aula10Application.class, args);
    }

}
