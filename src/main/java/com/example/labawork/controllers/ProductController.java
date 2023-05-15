package com.example.labawork.controllers;
import com.example.labawork.dto.ProductDto;
import com.example.labawork.exception.ResourceNotFoundException;
import com.example.labawork.services.ProductService;
import com.example.labawork.services.PropertiesService;
import com.example.labawork.utils.PageUtil;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@Controller
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
    private final PropertiesService propertiesService;


@GetMapping
    public String productList(Model model, Pageable pageable, HttpServletRequest uriBuilder) {
        var products = productService.getProducts(pageable);
        String uri = uriBuilder.getRequestURI();
        PageUtil.constructPageable(products, propertiesService.getDefaultPageSize(), model, uri);
        return "products";
    }
    @GetMapping("{id}")
    public String productById(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "product";
    }

    @GetMapping("/search")
    public String search(@RequestParam(value = "searchBy", required = false) String type,
                         @RequestParam(value = "search", required = false) String value,
                         Model model, Pageable pageable, HttpServletRequest uriBuilder) {
        if (value == null || productService.search(type, value, pageable).getContent().isEmpty()) {
            throw new ResourceNotFoundException(value);
        }
        Page<ProductDto> products = productService.search(type, value, pageable);
        String uri = uriBuilder.getRequestURI();
        PageUtil.constructPageable(products, propertiesService.getDefaultPageSize(), model, uri + "?" + "searchBy=" + type +
                "&" + "search=" + value);

        return "productBySearch";
    }

    @ExceptionHandler(NumberFormatException.class)
    @ResponseStatus(INTERNAL_SERVER_ERROR)
    public ResponseEntity<String> handleNotFoundException() {
        return new ResponseEntity<>("Неверный формат", HttpStatus.OK);
    }
}
