package com.example.aula10.controllers;

import com.example.aula10.models.CarModel;
import com.example.aula10.services.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public ResponseEntity<List<CarModel>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(carService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarModel> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(carService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody CarModel carModel) {
        carService.create(carModel);
        return ResponseEntity.ok().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> updateById(@PathVariable Long id, @RequestBody CarModel carModel) {
        carService.updateById(id, carModel);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        carService.deleteById(id);
        return ResponseEntity.ok().body("Car deleted successfully");
    }

}
