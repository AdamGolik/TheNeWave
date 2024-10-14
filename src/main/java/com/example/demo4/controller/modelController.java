package com.example.demo4.controller;

import com.example.demo4.Model.model;
import com.example.demo4.repository.modelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class modelController {
    @Autowired
    private modelRepository modelRepository;

    @GetMapping
    public List<String> getAllUsersNames() {
        return modelRepository.findAll().stream()
                .map(model -> model.getName())
                .collect(Collectors.toList());
    }

    @GetMapping("/users")
    public List<model> getAllUsers() {
        return modelRepository.findAll();
    }

    @PostMapping("/users")
    public model createUser(@RequestBody model user) {
        return modelRepository.save(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        modelRepository.deleteById(id);
    }
}


