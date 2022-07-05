package com.codeswollop.customers.utility;

import com.codeswollop.customers.entity.Card;
import com.codeswollop.customers.entity.Customer;
import com.codeswollop.customers.repository.CardRepository;
import com.codeswollop.customers.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CardUtility {

    private final CardRepository cardRepository;
    private final CustomerRepository customerRepository;

    public void saveCardToUser(Customer customer, List<Card> cards) {
         for (Card card: cards){
             //card.setCardNumber();
             card.setCustomer(customer);
             cardRepository.save(card);
         }
    }

}
