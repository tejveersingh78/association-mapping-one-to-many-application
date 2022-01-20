package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Order;
import com.sunglowsys.service.CustomerServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class SaveCustomer {
    public static void main(String[] args) {

        List<Order> orderList = new ArrayList<>();
        Order order = new Order("Beg","Sports","32L","900","order placed");
        Order order1 = new Order("Bike","Hero","first modul","105000","order placed");
        Order order2 = new Order("Watch","Titenic","1st","1500","order placed");
        Customer customer = new Customer("Hirdesh","Kumar","hk@gmail.com","9885746545","male");

        orderList.add(order);
        orderList.add(order1);
        orderList.add(order2);

        customer.setOrder(orderList);
        new CustomerServiceImpl().saveCustomer(customer);
        System.out.println(customer);
    }
}
