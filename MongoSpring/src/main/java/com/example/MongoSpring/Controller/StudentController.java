package com.example.MongoSpring.Controller;

import com.example.MongoSpring.Model.Student;
import com.example.MongoSpring.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/readStudent/{rollNo}")
    public Student showStudent(@PathVariable Integer rollNo) {
        return studentRepository.findById(rollNo).get();
    }

    @PostMapping("/createStudent")
    public void addStudent(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @PutMapping("/updateStudent/{rollNo}")
    public ResponseEntity<String> updateStudent(@PathVariable Integer rollNo, @RequestBody Student student) {
        Optional<Student> existingStudentOpt = studentRepository.findById(rollNo);

        if (existingStudentOpt.isPresent()) {
            Student existingStudent = existingStudentOpt.get();

            existingStudent.setName(student.getName());
            existingStudent.setEmail(student.getEmail());

            studentRepository.save(existingStudent);
            return ResponseEntity.ok("Student updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
        }
    }

    @DeleteMapping("/deleteStudent/{rollNo}")
    public void deleteStudent(@PathVariable Integer rollNo) {
        studentRepository.deleteById(rollNo);
    }
}

