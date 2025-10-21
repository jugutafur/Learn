package com.borrar.Uno.Persistence;

import com.borrar.Uno.Domain.Card;
import com.borrar.Uno.Domain.Repository.CardRepository;
import com.borrar.Uno.Persistence.CRUD.TarjetaCRUDRepository;
import com.borrar.Uno.Persistence.Entity.Tarjeta;
import com.borrar.Uno.Persistence.Mapper.CardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TarjetaRepository implements CardRepository {

    @Autowired
    private TarjetaCRUDRepository tarjetaCRUDRepository;

    @Autowired
    private CardMapper cardMapper;

    @Override
    public List<Card> getAllCards() {
        List<Tarjeta> tarjetas = (List<Tarjeta>) tarjetaCRUDRepository.findAll();
        return cardMapper.toListCards(tarjetas);
    }

    @Override
    public Optional<Card> getCard(int id) {
        return tarjetaCRUDRepository.findById(id).map(data-> cardMapper.toCard(data));
    }

    @Override
    public Card saveCard(Card card) {
        Tarjeta tarjeta = cardMapper.toTarjeta(card);
        return cardMapper.toCard(tarjetaCRUDRepository.save(tarjeta));
    }

    @Override
    public void deleteCard(int cardId) {
        tarjetaCRUDRepository.deleteById(cardId);
    }
}
