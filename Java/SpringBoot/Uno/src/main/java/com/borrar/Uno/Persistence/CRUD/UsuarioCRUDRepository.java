package com.borrar.Uno.Persistence.CRUD;

import org.springframework.data.repository.CrudRepository;
import com.borrar.Uno.Persistence.Entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioCRUDRepository extends CrudRepository<Usuario, Long>{
    public abstract ArrayList<Usuario> findByPrioridad(Integer prioridad);
}
