package com.example.labawork.services;

import com.example.labawork.entities.Product;
import com.example.labawork.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public Page<Product> getByName(String name) {

        return productRepository.findProductsByName(name);
    }

    public Page<Product> getByPrice(int price) {

        return productRepository.findProductsByPrice(price);
    }

    public Page<Product> getByDescription(String description) {

        return productRepository.findProductsByDescription(description);
    }
//    private void Pageable(){
//        int page = 1;
//
//        int count = 3;
//
//        Pageable pageable = PageRequest.of(page, count);
//
//        Page<Product> pagedResult =
//
//                productRepository.findProductsByName(pageable);
//    }

}
