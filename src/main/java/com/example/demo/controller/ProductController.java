package com.example.demo.controller;

import com.example.demo.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable int productId) {
//        new feature
        return new Product(productId, productId + " name");
    }
}
