package com.sunglowsys.repository;

import com.sunglowsys.domain.Customer;

import java.util.List;

public interface CustomerRepository {

    Customer saveCustomer(Customer customer);

    Customer updateCustomer(Customer customer,Long id);

    Customer findById(Long id);

    List<Customer> findAll();

    void deleteCustomer(Long id);
}
