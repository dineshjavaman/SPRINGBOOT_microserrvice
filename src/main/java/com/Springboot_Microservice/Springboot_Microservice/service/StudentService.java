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
        StudentRepository studentRepository;
    public List<Student> getAllStudent(){
        List<Student> studentList=new ArrayList<Student>();

        studentRepository.findAll().forEach(student -> studentList.add(student));
        return studentList;
    }
    public Student getStudentById(int id)
    {
        return studentRepository.findById(id).get();
    }
    public void saveOrUpdate(Student student)
    {
        studentRepository.save(student);
    }
    public void delete(int id)
    {
       studentRepository.deleteById(id);
    }

}
