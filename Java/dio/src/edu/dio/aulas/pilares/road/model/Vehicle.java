package edu.dio.aulas.pilares.road.model;

public abstract class Vehicle {

    private String licensePlate;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public abstract void turnOn();
}
