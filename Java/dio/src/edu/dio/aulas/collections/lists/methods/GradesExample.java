package edu.dio.aulas.collections.lists.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GradesExample {

    static ArrayList<Double> grades = new ArrayList<>();

    public static void main(String[] args) {
        grades.add(7.6);
        grades.add(5.0);
        grades.add(5.5);
        grades.add(9.3);
        grades.add(4.5);
        grades.add(6.0);
        System.out.println(grades);

        System.out.println(grades.indexOf(9.3));

        grades.add(4, 8.0);
        System.out.println(grades);

        grades.set(1, 6.0);
        System.out.println(grades);

        System.out.println(grades.contains(5.0));

        System.out.println(grades.get(2));

        System.out.println(Collections.min(grades));
        System.out.println(Collections.max(grades));

        Iterator<Double> iterator = grades.iterator();
        Double sum = 0.0;
        while (iterator.hasNext()) {
            sum = iterator.next();
        }

        System.out.println(sum);

        System.out.println(sum / grades.size());

        grades.remove(4.5);
        System.out.println(grades);

        grades.remove(0);
        System.out.println(grades);

        Iterator<Double> greaterThanSeven = grades.iterator();
        while (greaterThanSeven.hasNext()) {
            if (greaterThanSeven.next() < 7) {
                greaterThanSeven.remove();
            }
        }

        System.out.println(grades);

        grades.clear();

        System.out.println(grades.isEmpty());
    }

}
