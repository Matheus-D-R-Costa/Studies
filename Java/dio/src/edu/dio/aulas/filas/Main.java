package edu.dio.aulas.filas;

public class Main {

    static Queue<String> myQueue = new Queue<>();

    public static void main(String[] args) {

        myQueue.enqueue("Philipe");
        myQueue.enqueue("Tedson");
        myQueue.enqueue("Jebaldo");
        myQueue.enqueue("Cavalo");

        System.out.println(myQueue);

        System.out.println(myQueue.dequeue());

        System.out.println(myQueue);

        myQueue.enqueue("Flamengo");

        System.out.println(myQueue);

        System.out.println(myQueue.first());

        System.out.println(myQueue);

    }
}