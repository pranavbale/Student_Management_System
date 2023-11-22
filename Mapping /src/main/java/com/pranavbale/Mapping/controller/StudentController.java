package com.pranavbale.Mapping.controller;

import com.pranavbale.Mapping.entity.Student;
import com.pranavbale.Mapping.exceptions.StudentNotFoundException;
import com.pranavbale.Mapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("all")
    private ResponseEntity<List<Student>> getAllStudents(){

         return new ResponseEntity<>(studentService.getAllStudent(), HttpStatus.OK);
    }
}
