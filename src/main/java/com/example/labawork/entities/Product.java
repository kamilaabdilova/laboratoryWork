package com.example.labawork.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Min(2)
    private String name;

    @NotBlank
    private String category;

    @NotBlank
    private String description;

    @Positive
    private Integer price;

    @NotBlank
    @Size(min = 1, max = 128)
    private String image;




}
