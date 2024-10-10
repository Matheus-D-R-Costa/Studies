package com.example.carro.repositories;

import com.example.carro.models.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public interface CarRepository extends JpaRepository<CarModel, Integer> {
    Set<CarModel> fakeDb = new HashSet<>();


    default List<CarModel> findAll() {
        return fakeDb.stream().toList();
    }

}
