package edu.dio.aulas.collections.lists.orderned;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CatsExample {

    static ArrayList<Cat> cats = new ArrayList<>(){{
        add(new Cat("Silas", 2, "white"));
        add(new Cat("Congo", 3, "Black"));
        add(new Cat("Pumba", 1, "Gray"));
    }};

    public static void main(String[] args) {
        System.out.println(cats);

        Collections.shuffle(cats);
        System.out.println(cats);

        Collections.sort(cats);
        System.out.println(cats);

        cats.sort(new ComparatorAge());
        System.out.println(cats);

        cats.sort(new ComparatorColor());
        System.out.println(cats);

        cats.sort(new ComparatorAll());
        System.out.println(cats);
    }

}

class Cat implements Comparable<Cat> {
    private String name;
    private Integer age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        return this.getName().compareToIgnoreCase(cat.getName());
    }
}

class ComparatorAge implements Comparator<Cat> {

    @Override
    public int compare(Cat g1, Cat g2) {
        return Integer.compare(g1.getAge(), g2.getAge());
    }
}

class ComparatorColor implements Comparator<Cat> {

    @Override
    public int compare(Cat g1, Cat g2) {
        return g1.getColor().compareToIgnoreCase(g2.getColor());
    }
}

class ComparatorAll implements Comparator<Cat> {

    @Override
    public int compare(Cat g1, Cat g2) {
        int name = g1.getName().compareToIgnoreCase(g2.getName());
        if (name != 0) return name;

        int age = Integer.compare(g1.getAge(), g2.getAge());
        if (age != 0) return age;

        int color = g1.getColor().compareToIgnoreCase(g2.getColor());
        if (color != 0) return color;

        return 0;

    }
}