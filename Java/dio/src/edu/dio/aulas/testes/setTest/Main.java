package edu.dio.aulas.testes.setTest;

import java.util.HashSet;
import java.util.Set; // set não segue uma ordem
import java.util.TreeSet;

public class Main {

    static Set<Car> hashSetCars = new HashSet<>();
    static Set<Car> treeSetCars = new TreeSet<>();

    public static void main(String[] args) {

        hashSetCars.add(new Car("Ford"));
        hashSetCars.add(new Car("Chevrolet"));
        hashSetCars.add(new Car("Fiat"));
        hashSetCars.add(new Car("Peugeot"));
        hashSetCars.add(new Car("Zip"));
        hashSetCars.add(new Car("Alpha Romeo"));
        System.out.println(hashSetCars);

        treeSetCars.add(new Car("Ford"));
        treeSetCars.add(new Car("Chevrolet"));
        treeSetCars.add(new Car("Fiat"));
        treeSetCars.add(new Car("Peugeot"));
        treeSetCars.add(new Car("Zip"));
        treeSetCars.add(new Car("Alpha Romeo"));
        System.out.println(treeSetCars);
    }

}
