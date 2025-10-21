package com.borrar.Uno.Domain.Repository;

import com.borrar.Uno.Domain.Card;

import java.util.List;
import java.util.Optional;

public interface CardRepository {
    List<Card> getAllCards();
    Optional<Card> getCard(int id);
    Card saveCard(Card card);
    void deleteCard(int cardId);
}
