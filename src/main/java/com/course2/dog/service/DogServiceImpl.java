package com.course2.dog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course2.dog.entity.Dog;
import com.course2.dog.repository.DogRepository;

@Service
public class DogServiceImpl implements DogService{
	@Autowired
    DogRepository dogRepository;

    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    public List<String> retrieveDogBreed() {
        return (List<String>) dogRepository.findAllBreed();
    }

    public String retrieveDogBreedById(Long id) {
        return (String) dogRepository.findBreedById(id);
    }

    public List<String> retrieveDogNames() {
        return (List<String>) dogRepository.findAllName();
    }
}
