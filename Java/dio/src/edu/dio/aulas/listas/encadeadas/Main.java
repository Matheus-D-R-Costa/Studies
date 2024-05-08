package edu.dio.aulas.listas.encadeadas;

public class Main {

    static LinkedList<String> myLinkedList = new LinkedList<>();

    public static void main(String[] args) {
        myLinkedList.add("Rotweiler");
        myLinkedList.add("Cane Corso");
        myLinkedList.add("Alabai");
        myLinkedList.add("Brazilian Mastiff");

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));

        System.out.println(myLinkedList);

        System.out.println(myLinkedList.remove(2));

        System.out.println(myLinkedList);
    }
}
