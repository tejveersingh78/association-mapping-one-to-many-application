package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.repository.CustomerRepositoryImpl;

public class UpdateCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("Surendra");
        new CustomerRepositoryImpl().updateCustomer(customer,2L);
    }
}
