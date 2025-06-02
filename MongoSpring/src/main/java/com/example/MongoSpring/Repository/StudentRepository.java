package com.example.MongoSpring.Repository;

import com.example.MongoSpring.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {
}
