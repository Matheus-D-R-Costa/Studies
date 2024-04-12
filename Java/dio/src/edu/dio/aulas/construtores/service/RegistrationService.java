package edu.dio.aulas.construtores.service;

import edu.dio.aulas.construtores.model.People;

public class RegistrationService {

    static People philipe = new People(13688195375L);

    public static void main(String[] args) {

        philipe.setName("Philipe");

        System.out.println("Usuário " + philipe.getName() + " foi cadastrado com a senha " + philipe.getCpf());
    }
}
