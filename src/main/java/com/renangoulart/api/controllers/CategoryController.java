package com.renangoulart.api.controllers;

import com.renangoulart.api.entities.Category;
import com.renangoulart.api.repositories.CategoryRepository;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryRepository repository;

    @Operation(description = "Retorna todas categorias")
    @GetMapping
    public List<Category> findAll() {
        return repository.findAll();
    }

    @Operation(description = "Retorna uma categorias com base no id informado")
    @GetMapping(value = "/{id}")
    public Category findById(@PathVariable Long id) {
        Optional<Category> category = repository.findById(id);
        return category.orElse(null);
    }

    @Operation(description = "Cadastra e retorna uma nova categoria")
    @PostMapping
    public Category insert(@RequestBody Category category) {
        return repository.save(category);
    }
}
