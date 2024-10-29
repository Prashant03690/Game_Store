package com.microservice.order.service;

import com.microservice.order.dto.OrderRequest;

public interface OrderService {

    public void placeOrder(OrderRequest orderRequest);

}
