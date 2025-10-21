package net.javaguides.sms.Domain.Repository;

import java.util.List;

import net.javaguides.sms.Persistence.Entity.Student;

public interface StudentRepository {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudentById(Long id);
}
