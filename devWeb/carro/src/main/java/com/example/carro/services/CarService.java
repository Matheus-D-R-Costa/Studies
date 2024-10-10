package com.example.carro.services;

import com.example.carro.models.CarModel;
import com.example.carro.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public List<CarModel> findAll() {
        return repository.findAll();
    }
}
