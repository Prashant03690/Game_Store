package com.microservice.product.controller;

import com.microservice.product.dto.ProductRequest;
import com.microservice.product.model.Product;
import com.microservice.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Product createProduct(@RequestBody ProductRequest productRequest){
        return productService.createProduct(productRequest);
    }

}
