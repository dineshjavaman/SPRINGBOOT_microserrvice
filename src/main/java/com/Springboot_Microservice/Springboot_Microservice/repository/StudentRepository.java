package com.Springboot_Microservice.Springboot_Microservice.repository;

import com.Springboot_Microservice.Springboot_Microservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

   }