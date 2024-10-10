package com.example.carro.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarModel {

    public CarModel(Integer ID, String model, String brand, Integer year) {
        this.ID = ID;
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    private Integer ID;
    private String model;
    private String brand;
    private Integer year;

}
