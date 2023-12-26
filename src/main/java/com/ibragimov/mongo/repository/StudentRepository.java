package com.ibragimov.mongo.repository;

import com.ibragimov.mongo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
    // Custom queries if needed
}
