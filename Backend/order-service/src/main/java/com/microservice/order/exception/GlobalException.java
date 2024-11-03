package com.microservice.order.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalException {

    @ExceptionHandler(OutOfStockException.class)
    public String productOutOfStock(OutOfStockException ex){
        log.error("Product out of stock!");
        return ex.getMessage();
    }

}
