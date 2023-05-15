package com.example.labawork.dto;
import com.example.labawork.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private Long id;

    @NotBlank
    @Min(2)
    private String name;
    @NotBlank
    private String category;

    @Positive
    private Integer price;

    @NotBlank
    @Size(min = 1, max = 128)
    private String image;

    @NotBlank
    private String description;


    public static ProductDto from(Product product) {
        return builder()
                .id(product.getId())
                .name(product.getName())
                .category(product.getCategory())
                .price(product.getPrice())
                .image(product.getImage())
                .description(product.getDescription())
                .build();

    }
}
