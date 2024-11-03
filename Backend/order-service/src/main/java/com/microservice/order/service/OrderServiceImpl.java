package com.microservice.order.service;

import com.microservice.order.dto.OrderRequest;
import com.microservice.order.exception.OutOfStockException;
import com.microservice.order.inventoryclient.InventoryClient;
import com.microservice.order.model.Order;
import com.microservice.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;
    private final InventoryClient inventoryClient;

    @Override
    public String placeOrder(OrderRequest orderRequest) {
        boolean isProductInStock = inventoryClient.isProductInStock(orderRequest.skuCode(), orderRequest.quantity());
        if(isProductInStock){
            Order order = Order.builder().
                    orderNumber(UUID.randomUUID().toString()).
                    skuCode(orderRequest.skuCode()).
                    price(orderRequest.price()).
                    quantity(orderRequest.quantity()).
                    build();
            orderRepository.save(order);
            return "Your order " + orderRequest.skuCode() + " has been placed Successfully";
        }else{
            throw new OutOfStockException(orderRequest.skuCode() + " is out of stock. Sorry for the inconvenience!!!");
        }
    }
}
