package com.pranavbale.Mapping.controller;

import com.pranavbale.Mapping.entity.Teacher;
import com.pranavbale.Mapping.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ResourceBundle;
import java.util.UUID;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    // adding a new Teacher
    @PostMapping("/add")
    private ResponseEntity<Teacher> addNewTeacher(@RequestBody Teacher teacher) {
        return new ResponseEntity<>(teacherService.addNewteacher(teacher), HttpStatus.CREATED);
    }

    //update a existing Teacher
    @PutMapping("update/{id}")
    private ResponseEntity<Teacher> updateTeacher(@RequestBody Teacher teacher, @PathVariable UUID id) {
        return new ResponseEntity<>(teacherService.updateTeacher(id, teacher), HttpStatus.OK);
    }

    // find Teacher by Id
    @GetMapping("getById/{id}")
    private ResponseEntity<Teacher> getTeacherById(@PathVariable UUID id) {
        return new ResponseEntity<>(teacherService.getTeacherById(id), HttpStatus.OK);
    }

    // find all teacher
    @GetMapping("findAll")
    private ResponseEntity<List<Teacher>> getAllTeachers() {
        return new ResponseEntity<>(teacherService.getAllTeachers(), HttpStatus.OK);
    }

    // delete teacher
    @DeleteMapping("delete/{id}")
    private ResponseEntity<String> deleteTeacherById(@PathVariable UUID id) {
        teacherService.deleteTeacherById(id);
        return new ResponseEntity<>("Teacher Deleted Successfully", HttpStatus.OK);
    }


}
