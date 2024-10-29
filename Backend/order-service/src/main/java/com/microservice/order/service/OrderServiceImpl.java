package com.microservice.order.service;

import com.microservice.order.dto.OrderRequest;
import com.microservice.order.model.Order;
import com.microservice.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;

    @Override
    public void placeOrder(OrderRequest orderRequest) {
        Order order = Order.builder().
                orderNumber(UUID.randomUUID().toString()).
                skuCode(orderRequest.skuCode()).
                price(orderRequest.price()).
                quantity(orderRequest.quantity()).
                build();
        orderRepository.save(order);
    }
}
