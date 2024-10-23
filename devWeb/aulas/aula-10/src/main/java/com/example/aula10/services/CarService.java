package com.example.aula10.services;

import com.example.aula10.models.CarModel;
import com.example.aula10.repositories.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Transactional(readOnly = true)
    public List<CarModel> findAll() {
        return carRepository.findAll();
    }

    @Transactional(readOnly = true)
    public CarModel findById(Long id) {
        Optional<CarModel> carModel = carRepository.findById(id);
        if (carModel.isEmpty()) throw new IllegalArgumentException("User not Found");
        return carModel.get();
    }
    
    @Transactional
    public void create(CarModel carModel) {
        carRepository.save(carModel);
    }

    @Transactional
    public void updateById(Long id, CarModel carModel) {
        Optional<CarModel> carModelInDatabase = carRepository.findById(id);
        if (carModelInDatabase.isEmpty()) throw new IllegalArgumentException("User not Found");

        if (carModelInDatabase.get().getBrand().equals(carModel.getModel())) {
            carModelInDatabase.get().setBrand(carModel.getBrand());
        }

        if (carModelInDatabase.get().getModel().equals(carModel.getModel())) {
            carModelInDatabase.get().setModel(carModel.getModel());
        }

        if (carModelInDatabase.get().getYear() == carModel.getYear()) {
            carModelInDatabase.get().setYear(carModel.getYear());
        }

        carRepository.save(carModelInDatabase.get());

    }

    @Transactional
    public void deleteById(Long id) {
        carRepository.deleteById(id);
    }

}
