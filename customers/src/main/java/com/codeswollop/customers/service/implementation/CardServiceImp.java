package com.codeswollop.customers.service.implementation;

import com.codeswollop.customers.entity.Card;
import com.codeswollop.customers.repository.CardRepository;
import com.codeswollop.customers.service.CardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CardServiceImp implements CardService {
    private final CardRepository cardRepository;

    @Override
    public List<Card> getAll() {
        return cardRepository.findAll();
    }

    @Override
    public Card update(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public Card create(Card card) {
        Card newCard = null;
        if (card != null) {
            newCard = cardRepository.save(card);
        }
        return newCard;
    }

}
