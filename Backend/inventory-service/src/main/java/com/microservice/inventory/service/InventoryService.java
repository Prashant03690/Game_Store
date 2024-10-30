package com.microservice.inventory.service;

public interface InventoryService {

    public boolean isProductInStock(String skuCode, int quantity);

}
