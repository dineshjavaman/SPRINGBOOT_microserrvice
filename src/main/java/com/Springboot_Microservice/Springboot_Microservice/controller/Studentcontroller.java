package com.Springboot_Microservice.Springboot_Microservice.controller;

import com.Springboot_Microservice.Springboot_Microservice.model.Student;
import com.Springboot_Microservice.Springboot_Microservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Studentcontroller {
    @Autowired
    StudentService studentService;
    @GetMapping("/student")
    public List<Student> getAllStudent()
    {
        return studentService.getAllStudent();
    }
    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable("id") int id)
    {
        studentService.delete(id);
    }
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable("id") int id)
    {
        return studentService.getStudentById(id);
    }
    @PostMapping("/student")
    public int saveStudent(@RequestBody Student student) {
        studentService.saveOrUpdate(student);
        return student.getId();
    }
    }
