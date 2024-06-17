package edu.dio.aulas.testes.stackTest;

import java.util.Stack;

public class Main {

    static Stack<Car> carStack = new Stack<>();

    public static void main(String[] args) {

        carStack.push(new Car("Ford"));
        carStack.push(new Car("Chevrolet"));
        carStack.push(new Car("Volkswagen"));
        carStack.push(new Car("Fiat"));

        System.out.println(carStack);

        System.out.println(carStack.peek());

        carStack.pop();

        System.out.println(carStack);

        System.out.println(carStack.empty());

    }
}
