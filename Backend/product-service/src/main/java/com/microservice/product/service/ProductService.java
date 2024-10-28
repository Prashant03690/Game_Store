package com.microservice.product.service;

import com.microservice.product.dto.ProductRequest;
import com.microservice.product.model.Product;

public interface ProductService {

    public Product createProduct(ProductRequest productRequest);
}
