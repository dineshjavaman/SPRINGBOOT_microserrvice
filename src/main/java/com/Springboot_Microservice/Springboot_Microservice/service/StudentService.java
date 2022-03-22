package com.Springboot_Microservice.Springboot_Microservice.service;

import com.Springboot_Microservice.Springboot_Microservice.model.Student;
import com.Springboot_Microservice.Springboot_Microservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    static
    StudentRepository repository;
    public static List<Student> getAllStudent(){
        List<Student> studentList=new ArrayList<Student>();

        repository.findAll().forEach(student -> studentList.add(student));
        return studentList;
    }
    public Student getStudentById(int id)
    {
        return repository.findById(id).get();
    }
    public void saveOrUpdate(Student student)
    {
        repository.save(student);
    }
    public void delete(int id)
    {
        repository.deleteById(id);
    }

}
