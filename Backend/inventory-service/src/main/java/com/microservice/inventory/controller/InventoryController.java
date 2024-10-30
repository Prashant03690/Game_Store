package com.microservice.inventory.controller;

import com.microservice.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    private boolean isProductInStock(@RequestParam String skuCode, @RequestParam int quantity){
        return inventoryService.isProductInStock(skuCode, quantity);
    }

}
