package com.example.pessoasapi.services;

import com.example.pessoasapi.models.PersonModel;
import com.example.pessoasapi.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<PersonModel> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public PersonModel findById(Long id) {
        Optional<PersonModel> personModel = repository.findById(id);
        if (personModel.isEmpty()) throw new IllegalArgumentException("User not Found");
        return personModel.get();
    }

    @Transactional
    public void create(PersonModel carModel) {
        repository.save(carModel);
    }

    @Transactional
    public void updateById(Long id, PersonModel personModel) {
        Optional<PersonModel> personModelInDb = repository.findById(id);
        if (personModelInDb.isEmpty()) throw new IllegalArgumentException("User not Found");

        if (!personModelInDb.get().getName().equals(personModel.getName())) {
            personModelInDb.get().setName(personModel.getName());
        }

        if (!personModelInDb.get().getEmail().equals(personModel.getEmail())) {
            personModelInDb.get().setEmail(personModel.getEmail());
        }

        if (!Objects.equals(personModelInDb.get().getPhoneNumber(), personModel.getPhoneNumber())) {
            personModelInDb.get().setPhoneNumber(personModel.getPhoneNumber());
        }

        if (!personModelInDb.get().getAddress().equals(personModel.getAddress())) {
            personModelInDb.get().setAddress(personModel.getAddress());
        }

        if (personModelInDb.get().getStatus() != personModel.getStatus()) {
            personModelInDb.get().setStatus(personModel.getStatus());
        }

        repository.save(personModelInDb.get());

    }

    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
