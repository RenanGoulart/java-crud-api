package com.renangoulart.api.controllers;

import com.renangoulart.api.entities.Product;
import com.renangoulart.api.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    public List<Product> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Product findById(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @GetMapping(value = "/category/{id}")
    public List<Product> findByCategory(@PathVariable Long id) { return repository.findByCategoryId(id); }

    @PostMapping
    public Product insert(@RequestBody Product product) {
        return repository.save(product);
    }
}
