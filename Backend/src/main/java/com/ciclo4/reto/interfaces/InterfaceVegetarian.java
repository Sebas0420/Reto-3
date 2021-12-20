package com.ciclo4.reto.interfaces;

import com.ciclo4.reto.modelo.Vegetarian;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceVegetarian extends MongoRepository <Vegetarian, String>{
}
