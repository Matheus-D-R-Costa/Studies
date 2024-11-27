package com.carro.backend.service;

import com.carro.backend.models.CarroModel;
import com.carro.backend.repositories.CarroRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    private final CarroRepository repository;

    public CarroService(CarroRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<CarroModel> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public CarroModel findById(Long id) {
        Optional<CarroModel> carro = repository.findById(id);
        if (carro.isEmpty()) throw new IllegalArgumentException("Esse carro não existe!");
        return carro.get();
    }

    @Transactional
    public void create(CarroModel carModel) {
        saveCarro(carModel);
    }

    @Transactional
    public void updateById(Long id, CarroModel carroModel) {
        CarroModel carroInDatabase = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Carro Inexistente"));

        carroInDatabase.setMarca(carroModel.getMarca());
        carroInDatabase.setModelo(carroModel.getModelo());
        carroInDatabase.setAno(carroModel.getAno());
        carroInDatabase.setCor(carroModel.getCor());

        saveCarro(carroInDatabase);
    }

    private void saveCarro(CarroModel carModel) {
        repository.save(carModel);
    }

    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
