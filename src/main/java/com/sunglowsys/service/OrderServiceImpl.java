package com.sunglowsys.service;

import com.sunglowsys.domain.Order;
import com.sunglowsys.repository.OrderRepository;
import com.sunglowsys.repository.OrderRepositoryImpl;

import java.util.List;

public class OrderServiceImpl implements OrderService{

    private OrderRepository orderRepository = new OrderRepositoryImpl();
    @Override
    public Order saveOrder(Order order) {
        return orderRepository.saveOrder(order);
    }

    @Override
    public Order updateOrder(Order order, Long id) {
        return orderRepository.updateOrder(order,id);
    }

    @Override
    public Order findById(Long id) {
            return orderRepository.findById(id);
    }

    @Override
    public List<Order> findAll() {
        List<Order> orderList = orderRepository.findAll();
        return orderList;
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteOrder(id);

    }
}
