package net.javaguides.sms.Persistence.CRUD;

import net.javaguides.sms.Persistence.Entity.Ciudad;
import org.springframework.data.repository.CrudRepository;

public interface CiudadCRUDRepository extends CrudRepository<Ciudad, Integer> {
}