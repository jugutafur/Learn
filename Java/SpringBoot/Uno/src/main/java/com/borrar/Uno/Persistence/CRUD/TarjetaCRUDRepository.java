package com.borrar.Uno.Persistence.CRUD;

import com.borrar.Uno.Persistence.Entity.Tarjeta;
import org.springframework.data.repository.CrudRepository;

public interface TarjetaCRUDRepository extends CrudRepository<Tarjeta, Integer> {
}
