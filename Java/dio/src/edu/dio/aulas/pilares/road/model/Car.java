package edu.dio.aulas.pilares.road.model;

public class Car extends Vehicle {

    public void turnOn() {
        checkTheConditions();
        putTheKeyIn();
        turnTheKey();
        System.out.println("Carro Ligado");
    }

    private void checkTheConditions() {
        checkBrake();
        checkTheDashboard();
    }

    private void checkBrake() {
        System.out.println("Freio checado");
    }

    private void checkTheDashboard() {
        System.out.println("Painel checado");
    }

    private void putTheKeyIn() {
        System.out.println("Inserindo a chave");
    }

    private void turnTheKey() {
        System.out.println("Girando a chave");
    }
}
