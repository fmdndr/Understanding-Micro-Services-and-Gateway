package com.codeswollop.customers.service;

import com.codeswollop.customers.entity.Card;

import java.util.List;

public interface CardService {
    Card create(Card card);

    List<Card> getAll();

    Card update(Card card);
}
