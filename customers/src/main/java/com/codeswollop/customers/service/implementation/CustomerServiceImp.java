package com.codeswollop.customers.service.implementation;

import com.codeswollop.customers.entity.Customer;
import com.codeswollop.customers.repository.CustomerRepository;
import com.codeswollop.customers.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImp implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer create(Customer customer) {
        Customer newCustomer = null;
        if (customer != null) {
            newCustomer = customerRepository.save(customer);
        }
        return newCustomer;
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

}
