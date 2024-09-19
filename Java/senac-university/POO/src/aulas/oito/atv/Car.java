package aulas.oito.atv;

public class Car {

    private String color;
    private String model;
    private String brand;
    private String fuelType;
    private int year;
    private double marketValue;

    public Car(String color, String model, String brand, String fuelType, int year, double marketValue) {
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.fuelType = fuelType;
        this.year = year;
        this.marketValue = marketValue;
    }

    public void turnOn() {
        System.out.println("Carro ligado...");
    }

    public void turnOff() {
        System.out.println("Carro desligado...");
    }

    public void changeGear(int number) {
        System.out.println("Marcha na " + number);
    }

    public void speedUp() {
        System.out.println("Acelerando...");
    }

    public void speedDown() {
        System.out.println("Freiando...");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    @Override
    public String toString() {
        return String.format(
                "Car {\n" +
                        "  Color      : %s\n" +
                        "  Model      : %s\n" +
                        "  Brand      : %s\n" +
                        "  Fuel Type  : %s\n" +
                        "  Year       : %d\n" +
                        "  Market Value: %.2f\n" +
                        "}",
                color, model, brand, fuelType, year, marketValue
        );
    }

}
