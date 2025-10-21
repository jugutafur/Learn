package net.javaguides.sms.Domain.Service;

import java.util.List;

import net.javaguides.sms.Persistence.CRUD.StudentCRUDRepository;
import org.springframework.stereotype.Service;

import net.javaguides.sms.Persistence.Entity.Student;
import net.javaguides.sms.Domain.Repository.StudentRepository;

@Service
public class StudentRepositoryImpl implements StudentRepository {

	private StudentCRUDRepository studentCRUDRepository;
	
	public StudentRepositoryImpl(StudentCRUDRepository studentCRUDRepository) {
		super();
		this.studentCRUDRepository = studentCRUDRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentCRUDRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentCRUDRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentCRUDRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentCRUDRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentCRUDRepository.deleteById(id);
	}

}
