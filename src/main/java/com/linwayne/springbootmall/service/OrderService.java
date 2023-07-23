package com.linwayne.springbootmall.service;

import com.linwayne.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
