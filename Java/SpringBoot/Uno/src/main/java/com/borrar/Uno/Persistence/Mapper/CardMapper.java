package com.borrar.Uno.Persistence.Mapper;

import com.borrar.Uno.Domain.Card;
import com.borrar.Uno.Persistence.Entity.Tarjeta;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CardMapper {
    @Mappings({
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "imagen", target = "image"),
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "fecha", target = "date")
    })

    Card toCard (Tarjeta tarjeta);
    List<Card> toListCards(List<Tarjeta> tarjetas);

    @InheritInverseConfiguration
    Tarjeta toTarjeta(Card card);

}
