package net.javaguides.sms.Persistence.CRUD;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.Persistence.Entity.Student;

public interface StudentCRUDRepository extends JpaRepository<Student, Long>{

}
