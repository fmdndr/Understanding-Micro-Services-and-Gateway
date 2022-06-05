package com.codeswollop.customers.controller;

import com.codeswollop.customers.entity.Customer;
import com.codeswollop.customers.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@CrossOrigin("*")
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer) {

        return ResponseEntity.ok(customerService.create(customer));
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAll() {
        return ResponseEntity.ok(customerService.getAll());
    }

}
