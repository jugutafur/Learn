package com.borrar.Uno.Persistence.CRUD;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.borrar.Uno.Domain.Student;

public interface StudentCRUDRepository extends JpaRepository<Student, Long> {

}
