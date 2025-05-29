package com.example.Student.Service;
import com.example.Student.Model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student student);
    Student patchStudent(Long id, Student student);
    void deleteStudent(Long id);
}