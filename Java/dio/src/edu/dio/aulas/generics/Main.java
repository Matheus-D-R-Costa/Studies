package edu.dio.aulas.generics;

public class Main {

    static Box<Integer> integerBox = new Box<>(10);
    static Box<String> stringBox = new Box<>("Ford Fiesta");

    public static void main(String[] args) {

        System.out.println("Valor de integerBox: " + integerBox.getValue());

        System.out.println("Valor de stringBox: " + stringBox.getValue());

        integerBox.setValue(20);

        System.out.println("Valor de integerBox: " + integerBox.getValue());

    }
}
