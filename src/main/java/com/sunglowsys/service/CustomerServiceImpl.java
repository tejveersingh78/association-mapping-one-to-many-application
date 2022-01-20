package com.sunglowsys.service;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.repository.CustomerRepository;
import com.sunglowsys.repository.CustomerRepositoryImpl;
import sun.reflect.generics.repository.ConstructorRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository =  new CustomerRepositoryImpl();

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.saveCustomer(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer, Long id) {
        return customerRepository.updateCustomer(customer,id);
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = customerRepository.findAll();
        return customerList;
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteCustomer(id);

    }
}
