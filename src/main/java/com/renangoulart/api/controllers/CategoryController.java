package com.renangoulart.api.controllers;

import com.renangoulart.api.entities.Category;
import com.renangoulart.api.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryRepository repository;

    @GetMapping
    public List<Category> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Category findById(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping
    public Category insert(@RequestBody Category category) {
        return repository.save(category);
    }
}
