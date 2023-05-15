package com.example.labawork.repositories;

import com.example.labawork.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE lower(p.name) LIKE %?1%")
    Page<Product> findProductsByName(String name, Pageable pageable);

    @Query("SELECT p FROM Product p WHERE lower(p.category) LIKE %?1%")
    Page<Product> findProductsByCategory(String category, Pageable pageable);

    Page<Product> findProductsByPrice(int price, Pageable pageable);
    @Query("SELECT p FROM Product p WHERE lower(p.description) LIKE %?1%")
    Page<Product> findProductsByDescription(@Param("description") String description, Pageable pageable);
}
