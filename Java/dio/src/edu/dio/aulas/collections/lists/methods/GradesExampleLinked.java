package edu.dio.aulas.collections.lists.methods;

import java.util.ArrayList;
import java.util.LinkedList;

public class GradesExampleLinked {

    static ArrayList<Double> gradesInArrayList = new ArrayList<>();
    static LinkedList<Double> gradesInLinkedList;
    public static void main(String[] args) {

        gradesInArrayList.add(7.6);
        gradesInArrayList.add(5.0);
        gradesInArrayList.add(5.5);
        gradesInArrayList.add(9.3);
        gradesInArrayList.add(4.5);
        gradesInArrayList.add(6.0);

        gradesInLinkedList = new LinkedList<>(gradesInArrayList);

        System.out.println(gradesInArrayList);
        System.out.println(gradesInLinkedList);

        System.out.println(gradesInLinkedList.getFirst());
        System.out.println(gradesInLinkedList);

        System.out.println(gradesInLinkedList.pollFirst());
        System.out.println(gradesInLinkedList);

    }
}
