package edu.dio.aulas.testes.ListTest;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Car> carList = new ArrayList<>();

    public static void main(String[] args) {

        carList.add(new Car("Bmw"));
        carList.add(new Car("Byd"));
        carList.add(new Car ("Honda"));
        carList.add(new Car("Mercedes"));

        System.out.println(carList.contains(new Car("Ford")));

        System.out.println(carList.get(2));

        System.out.println(carList.indexOf(new Car("Honda")));

        System.out.println(carList.remove(1));

        System.out.println(carList);


    }

}
