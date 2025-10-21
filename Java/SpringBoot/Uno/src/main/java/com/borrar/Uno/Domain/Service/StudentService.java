package com.borrar.Uno.Domain.Service;

import java.util.List;

import com.borrar.Uno.Persistence.CRUD.StudentCRUDRepository;
import com.borrar.Uno.Domain.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentCRUDRepository studentCRUDRepository;

    public StudentService(StudentCRUDRepository studentCrudRepository) {
        super();
        this.studentCRUDRepository = studentCrudRepository;
    }

    public List<Student> getAllStudents() {
        return studentCRUDRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentCRUDRepository.save(student);
    }

    public Student getStudentById(Long id) {
        return studentCRUDRepository.findById(id).get();
    }

    public Student updateStudent(Student student) {
        return studentCRUDRepository.save(student);
    }

    public void deleteStudentById(Long id) {
        studentCRUDRepository.deleteById(id);
    }
}