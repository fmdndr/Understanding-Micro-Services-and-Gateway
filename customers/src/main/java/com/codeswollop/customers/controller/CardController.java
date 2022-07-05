package com.codeswollop.customers.controller;

import com.codeswollop.customers.entity.Card;
import com.codeswollop.customers.service.CardService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
@CrossOrigin("*")
@AllArgsConstructor
public class CardController {

    private final CardService cardService;

    @GetMapping
    public ResponseEntity<List<Card>> getAll() {
        return ResponseEntity.ok(cardService.getAll());
    }

    @PostMapping
    public ResponseEntity<Card> create(@RequestBody Card card) {
        return ResponseEntity.ok(cardService.create(card));
    }

    @PutMapping
    public ResponseEntity<Card> update(@RequestBody Card card) {
         return ResponseEntity.ok(cardService.update(card));
    }

}
