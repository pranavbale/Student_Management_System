package com.pranavbale.Mapping.service;

import com.pranavbale.Mapping.entity.Student;
import com.pranavbale.Mapping.exceptions.StudentNotFoundException;
import com.pranavbale.Mapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public List<Student> getAllStudent() {

        List<Student> students = (List) studentRepository.findAll();

        return students;
    }
}
