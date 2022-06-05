package com.codeswollop.customers.service;

import com.codeswollop.customers.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAll();

    Customer create(Customer customer);
}
