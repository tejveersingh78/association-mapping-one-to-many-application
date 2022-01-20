package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.repository.CustomerRepositoryImpl;

public class FindById {
    public static void main(String[] args) {
        Customer customer = new CustomerRepositoryImpl().findById(2L);
        System.out.println(customer);
    }
}
