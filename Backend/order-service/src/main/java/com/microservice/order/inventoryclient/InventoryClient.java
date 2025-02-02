package com.microservice.order.inventoryclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "inventory", url = "http://localhost:8082")
public interface InventoryClient {

    @GetMapping("/api/inventory")
    public boolean isProductInStock(@RequestParam String skuCode, @RequestParam Integer quantity);
}
