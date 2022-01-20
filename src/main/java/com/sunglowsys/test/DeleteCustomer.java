package com.sunglowsys.test;

import com.sunglowsys.repository.CustomerRepositoryImpl;

public class DeleteCustomer {
      public static void main(String[] args) {
                new CustomerRepositoryImpl().deleteCustomer(3L);
      }
}
