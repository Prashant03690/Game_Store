package com.microservice.product.service;

import com.microservice.product.dto.ProductRequest;
import com.microservice.product.model.Product;
import com.microservice.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product createProduct(ProductRequest productRequest) {
        Product product = Product.builder().
                id(productRequest.id()).
                name(productRequest.name()).
                description(productRequest.description()).
                price(productRequest.price()).build();
        productRepository.save(product);
        log.info("Product Created Successfully");
        return product;
    }
}
