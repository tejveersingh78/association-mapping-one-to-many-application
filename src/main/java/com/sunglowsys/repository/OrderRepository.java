package com.sunglowsys.repository;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.sunglowsys.domain.Order;

import java.util.List;

public interface OrderRepository {

    Order saveOrder(Order order);

    Order updateOrder(Order order,Long id);

    Order findById(Long id);

    List<Order> findAll();

    void deleteOrder(Long id);
}
