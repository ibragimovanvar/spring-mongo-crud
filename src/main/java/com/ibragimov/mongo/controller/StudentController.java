package com.ibragimov.mongo.controller;

import com.ibragimov.mongo.entity.Student;
import com.ibragimov.mongo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable String id, @RequestBody Student updatedStudent) {
        updatedStudent.setId(id);
        return studentRepository.save(updatedStudent);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentRepository.deleteById(id);
    }
}
