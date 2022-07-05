package com.codeswollop.customers.service.implementation;

import com.codeswollop.customers.entity.Card;
import com.codeswollop.customers.entity.Customer;
import com.codeswollop.customers.repository.CardRepository;
import com.codeswollop.customers.repository.CustomerRepository;
import com.codeswollop.customers.service.CustomerService;
import com.codeswollop.customers.utility.CardUtility;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImp implements CustomerService {

    private final CustomerRepository customerRepository;

    private final CardRepository cardRepository;

    @Override
    public Customer create(Customer customer) {
        Customer newCustomer = null;
        if (customer != null) {
            newCustomer = customerRepository.save(customer);
            if (customer.getCards() != null && !customer.getCards().isEmpty()) {
                for (Card card : newCustomer.getCards()) {
                    Card c = new Card();
                    c.setCustomer(newCustomer);
                    c.setCardNumber(card.getCardNumber());
                    cardRepository.save(c);
                }
            }
        }
        return newCustomer;
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

}
