package edu.dio.aulas.listas.circular;

public class Main {

    static CircularLinkedList<Integer> myCircularLinkedList = new CircularLinkedList<Integer>();

    public static void main(String[] args) {
        myCircularLinkedList.add(2);
        System.out.println(myCircularLinkedList);

        myCircularLinkedList.remove(0);
        System.out.println(myCircularLinkedList);

        myCircularLinkedList.add(5);
        System.out.println(myCircularLinkedList);

        myCircularLinkedList.add(7);
        myCircularLinkedList.add(3);
        System.out.println(myCircularLinkedList);

        System.out.println(myCircularLinkedList.get(0));
        System.out.println(myCircularLinkedList.get(1));
        System.out.println(myCircularLinkedList.get(2));
        System.out.println(myCircularLinkedList.get(3));
        System.out.println(myCircularLinkedList.get(4));
        System.out.println(myCircularLinkedList.get(5));

        for (int i = 0; i < 20; i++) {
            System.out.println(myCircularLinkedList.get(i));
        }
    }
}
