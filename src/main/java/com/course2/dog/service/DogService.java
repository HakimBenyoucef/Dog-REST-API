package com.course2.dog.service;

import java.util.List;

import com.course2.dog.entity.Dog;

public interface DogService {
    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
