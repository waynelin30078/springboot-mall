package com.linwayne.springbootmall.service;

import com.linwayne.springbootmall.dto.CreateOrderRequest;
import com.linwayne.springbootmall.dto.OrderQueryParams;
import com.linwayne.springbootmall.model.Order;

import java.util.List;

public interface OrderService {


    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order>getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);


}
