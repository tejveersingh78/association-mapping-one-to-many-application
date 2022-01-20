package com.sunglowsys.service;

import com.sunglowsys.domain.Order;

import java.util.List;

public interface OrderService {

    Order saveOrder(Order order);

    Order updateOrder(Order order,Long id);

    Order findById(Long id);

    List<Order> findAll();

    void deleteOrder(Long id);
}
