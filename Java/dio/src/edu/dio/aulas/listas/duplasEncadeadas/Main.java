package edu.dio.aulas.listas.duplasEncadeadas;

public class Main {

    static DoublyLinkedList<String> myDoublyLinkedList = new DoublyLinkedList<>();

    public static void main(String[] args) {

        myDoublyLinkedList.add("Martin Burger King");
        myDoublyLinkedList.add("Horseman");
        myDoublyLinkedList.add("Philipe");
        myDoublyLinkedList.add("Hatsuni");
        myDoublyLinkedList.add("Caviar");
        myDoublyLinkedList.add("Zeca Pagodinho");
        System.out.println(myDoublyLinkedList);

        myDoublyLinkedList.remove(2);
        myDoublyLinkedList.add("Calabreso", 2 );
        System.out.println(myDoublyLinkedList);

    }
}
