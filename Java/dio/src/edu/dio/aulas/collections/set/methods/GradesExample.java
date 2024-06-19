package edu.dio.aulas.collections.set.methods;

import java.util.*;

public class GradesExample {

//  static Set grades = new HashSet(); // antes do java 5
//  static HashMap<Double> grades = new HashSet<>(); // Diamond Operator (jdk 7)
//  static Set<Double> grades = Set.of(7d, 8.5, 9.3 ,5d, 7d, 0d, 3.6);
    static Set<Double> gradesInHashSet = new HashSet<>(Arrays.asList(7d, 8.5, 9.3 ,5d, 7d, 0d, 3.6));
    static LinkedHashSet<Double> gradesInLinkedHashSet;
    static TreeSet<Double> gradesInTreeSet;

    public static void main(String[] args) {
        System.out.println(gradesInHashSet);

        System.out.println(gradesInHashSet.contains(5d));

        System.out.println(Collections.min(gradesInHashSet));
        System.out.println(Collections.max(gradesInHashSet));

        Iterator<Double> iterator = gradesInHashSet.iterator();
        Double sum = 0d;
        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        System.out.println(sum);

        System.out.println(sum / gradesInHashSet.size());

        gradesInHashSet.remove(0d);
        System.out.println(gradesInHashSet);

        Iterator<Double> filterGreatersThanSeven = gradesInHashSet.iterator();
        while (filterGreatersThanSeven.hasNext()) {
            if (filterGreatersThanSeven.next() < 7) {
                filterGreatersThanSeven.remove();
            }
        }

        System.out.println(gradesInHashSet);

        gradesInLinkedHashSet = new LinkedHashSet<>(gradesInHashSet);
        System.out.println(gradesInLinkedHashSet);

        gradesInTreeSet = new TreeSet<>(gradesInLinkedHashSet);
        System.out.println(gradesInTreeSet);

        gradesInHashSet.clear();
        System.out.println(gradesInHashSet.isEmpty());
        System.out.println(gradesInLinkedHashSet.isEmpty());
        System.out.println(gradesInTreeSet.isEmpty());

    }
}
