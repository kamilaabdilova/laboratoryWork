package com.example.labawork.controllers;

import com.example.labawork.entities.Product;
import com.example.labawork.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    @GetMapping("/findByName/{name}")
    public ResponseEntity <Page<Product>> findByName(@PathVariable String name) {
        return new ResponseEntity<>(productService.getByName(name), HttpStatus.OK);
    }
    @GetMapping("/findByPrice/{price}")
    public ResponseEntity <Page<Product>> findByPrice(@PathVariable int price) {
        return new ResponseEntity<>(productService.getByPrice(price), HttpStatus.OK);
    }
    @GetMapping("/findByDescription/{description}")
    public ResponseEntity <Page<Product>> findByDescription(@PathVariable String description) {
        return new ResponseEntity<>(productService.getByDescription(description), HttpStatus.OK);
    }
}
