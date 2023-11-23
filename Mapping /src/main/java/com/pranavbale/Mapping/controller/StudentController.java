package com.pranavbale.Mapping.controller;

import com.pranavbale.Mapping.entity.Student;
import com.pranavbale.Mapping.exceptions.StudentNotFoundException;
import com.pranavbale.Mapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ResourceBundle;
import java.util.UUID;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    // add a Student
    @PostMapping("/add")
    private ResponseEntity<Student> addStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.CREATED);
    }

    // update a Student
    @PutMapping("/update/{id}")
    private ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable UUID id) {
        return new ResponseEntity<>(studentService.updateStudent(student, id), HttpStatus.OK);
    }


    // Get all students
    @GetMapping("/all")
    private ResponseEntity<List<Student>> getAllStudents(){

        return new ResponseEntity<>(studentService.getAllStudent(), HttpStatus.OK);
    }

    // get student by id
    @GetMapping("/gatById/{id}")
    private ResponseEntity<Student> getStudentById(@PathVariable UUID id) {

        return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.OK);
    }


    // Delete Student By Id
    @DeleteMapping("/delete/{id}")
    private ResponseEntity<String> deleteStudentById(@PathVariable UUID id) {
        studentService.deleteStudentById(id);
        return new ResponseEntity<>("Student has been deleted " + id, HttpStatus.OK);
    }

    // add student to batch
    @PutMapping("/addStudentToBatch/{id}")
    private ResponseEntity<Student> addStudentToBatch(@PathVariable UUID id, @RequestBody Student student) {
        return new ResponseEntity<>(studentService.addStudentToBranch(id, student), HttpStatus.OK);
    }
}
