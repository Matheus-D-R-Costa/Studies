package edu.dio.aulas.testes.QueueTest;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static Queue<Car> carQueue = new LinkedList<>();

    public static void main(String[] args) {

        carQueue.add(new Car("Fiat"));
        carQueue.add(new Car("Chevrolet"));
        carQueue.add(new Car("Volkswagen"));

        System.out.println(carQueue.add(new Car("Peugeot")));
        System.out.println(carQueue);

        System.out.println(carQueue.offer(new Car("Renault")));
        System.out.println(carQueue);

        System.out.println(carQueue.peek());
        System.out.println(carQueue);

        System.out.println(carQueue.poll());
        System.out.println(carQueue);

        System.out.println(carQueue.isEmpty());
        System.out.println(carQueue.size());
    }
}
