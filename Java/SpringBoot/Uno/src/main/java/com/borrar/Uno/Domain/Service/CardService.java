package com.borrar.Uno.Domain.Service;

import com.borrar.Uno.Domain.Card;
import com.borrar.Uno.Domain.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    public List<Card> getAllCards() {
        return cardRepository.getAllCards();
    }

    public Optional<Card> getCard(int id) {
        return cardRepository.getCard(id);
    }

    public Card saveCard(Card card) {
        return cardRepository.saveCard(card);
    }

    public boolean deleteCard(int cardId) {
        return getCard(cardId).map(card -> {
            cardRepository.deleteCard(cardId);
            return true;
        }).orElse(false);
    }
}
