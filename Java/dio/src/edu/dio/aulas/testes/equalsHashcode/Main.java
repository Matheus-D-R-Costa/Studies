package edu.dio.aulas.testes.equalsHashcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static List<Car> carList = new ArrayList<>();

    public static void main(String[] args) {

        carList.add(new Car("Ford"));
        carList.add(new Car("Chevrolet"));
        carList.add(new Car("Volkskwagen"));

        System.out.println(carList.contains(new Car("Ford")));
        System.out.println(new Car("Ford").hashCode());
        System.out.println(new Car("Ford").hashCode());
        System.out.println(new Car("Forb").hashCode());

        Car carOne = new Car("Ford");
        Car carTwo = new Car("Chevrolet");

        System.out.println(carOne.equals(carTwo));

        System.out.println(carList);
    }
}
