package com.ciclo4.reto.repositorio;


import com.ciclo4.reto.modelo.Vegetarian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import com.ciclo4.reto.interfaces.InterfaceVegetarian;

@Repository
public class VegetarianRepositorio {
    @Autowired
    private InterfaceVegetarian repository;

    public List<Vegetarian> getAll() {
        return repository.findAll();
    }

    public Optional<Vegetarian> getClothe(String reference) {
        return repository.findById(reference);
    }

    public Vegetarian create(Vegetarian clothe) {
        return repository.save(clothe);
    }

    public void update(Vegetarian clothe) {
        repository.save(clothe);
    }

    public void delete(Vegetarian clothe) {
        repository.delete(clothe);
    }
}
