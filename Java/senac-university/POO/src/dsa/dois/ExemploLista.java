package dsa.dois;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {

    public static void main(String[] args) {

        List<String> classmates = new ArrayList<>();
        classmates.add("Carlos");
        classmates.add("Jamal");
        classmates.add("Jackson");
        classmates.add("Julia");
        classmates.add("Mariana");

        classmates.forEach(System.out::println);

        System.out.println();
        classmates.remove(4);
        System.out.println();

        classmates.forEach(System.out::println);

    }

}
