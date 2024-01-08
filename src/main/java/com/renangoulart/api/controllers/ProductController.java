package com.renangoulart.api.controllers;

import com.renangoulart.api.entities.Product;
import com.renangoulart.api.repositories.ProductRepository;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @Operation(description = "Retorna todos produtos")
    @GetMapping
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Operation(description = "Retorna produtos com base no id de categoria informado")
    @GetMapping(value = "/category/{id}")
    public List<Product> findByCategory(@PathVariable Long id) { return repository.findByCategoryId(id); }

    @Operation(description = "Cadastra e retorna um novo produto")
    @PostMapping
    public Product insert(@RequestBody Product product) {
        return repository.save(product);
    }
}
