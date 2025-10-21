package com.borrar.Uno.Domain.Repository;

import com.borrar.Uno.Domain.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudentById(Long id);
}
