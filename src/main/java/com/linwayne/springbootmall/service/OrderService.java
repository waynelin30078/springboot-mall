package com.linwayne.springbootmall.service;

import com.linwayne.springbootmall.dto.CreateOrderRequest;
import com.linwayne.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);


}
