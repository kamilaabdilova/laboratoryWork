package com.example.labawork.services;

import com.example.labawork.dto.ProductDto;
import com.example.labawork.exception.ResourceNotFoundException;
import com.example.labawork.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;


    public Page<ProductDto> getProducts(Pageable pageable) {
        return productRepository.findAll(pageable)
                .map(ProductDto::from);
    }

    public Page<ProductDto> search(String type, String value, Pageable pageable) {
        if (type.equals("name")) {
            return productRepository.findProductsByName(value, pageable).map(ProductDto::from);
        }
        if (type.equals("category")) {
            return productRepository.findProductsByCategory(value, pageable).map(ProductDto::from);
        }
        if (type.equals("price")) {
            return productRepository.findProductsByPrice(Integer.parseInt(value), pageable).map(ProductDto::from);
        }
        if (type.equals("description")) {
            return productRepository.findProductsByDescription(value, pageable).map(ProductDto::from);
        }
        return null;
    }

    public ProductDto getProductById(Long id) {
        return ProductDto.from(productRepository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

}
