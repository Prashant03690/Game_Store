package com.microservice.product.service;

import com.microservice.product.dto.ProductRequest;
import com.microservice.product.dto.ProductResponse;
import com.microservice.product.model.Product;

import java.util.List;

public interface ProductService {

    public ProductResponse createProduct(ProductRequest productRequest);

    public List<ProductResponse> getALlProducts();
}
