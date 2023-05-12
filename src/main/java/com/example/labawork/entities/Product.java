package com.example.labawork.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", length = 128)
    private String name;
    @Column(name = "description", length = 128)
    private String description;
    @Column(name = "price")
    private int price;
    @Column(name = "image", length = 128)
    private String image;

}
