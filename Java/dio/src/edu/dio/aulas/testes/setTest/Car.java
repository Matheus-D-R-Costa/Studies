package edu.dio.aulas.testes.setTest;

import java.util.Objects;

public class Car implements Comparable<Car> {

    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(brand);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Car o) {
//        if (this.brand.length() < o.brand.length()) {
//            return -1;
//        } else if (this.brand.length() > o.brand.length()){
//            return 1;
//        }
//
//        return 0;
//
//    }

    @Override
    public int compareTo(Car o) {
        return this.getBrand().compareTo(o.getBrand());
    }
}
