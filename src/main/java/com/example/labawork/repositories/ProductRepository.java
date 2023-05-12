package com.example.labawork.repositories;

import com.example.labawork.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    Page<Product> findProductsByName(String name);

    Page<Product> findProductsByPrice(int price);

    Page<Product> findProductsByDescription(String description);
}
