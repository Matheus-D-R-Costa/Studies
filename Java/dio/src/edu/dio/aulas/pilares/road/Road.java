package edu.dio.aulas.pilares.road;

import edu.dio.aulas.pilares.road.model.Bike;
import edu.dio.aulas.pilares.road.model.Car;

public class Road {

    static Car hondaCivic_2007 = new Car();
    static Bike cg150 = new Bike();

    public static void main(String[] args) {

        hondaCivic_2007.setLicensePlate("69123857SC");
        cg150.setLicensePlate("8376548SP");

        hondaCivic_2007.turnOn();
        cg150.turnOn();
    }

}
