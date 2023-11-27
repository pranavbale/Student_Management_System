package com.pranavbale.Mapping.service;

import com.pranavbale.Mapping.entity.Batch;
import com.pranavbale.Mapping.entity.Student;
import com.pranavbale.Mapping.exceptions.StudentNotFoundException;
import com.pranavbale.Mapping.repository.BatchRepository;
import com.pranavbale.Mapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    BatchRepository batchRepository;


    public List<Student> getAllStudent() {

        List<Student> students = (List) studentRepository.findAll();

        return students;
    }


    public Student addStudent(Student student) {

        return studentRepository.save(student);

    }

    public Student updateStudent(Student student, UUID id) {

        Student student1 = studentRepository.findById(id).get();

        if(!student1.getName().equals(student.getName()))
            student1.setName(student.getName());
        if(!student1.getEmail().equals(student.getEmail()))
            student1.setEmail(student.getEmail());
        if(!student1.getAddress().equals(student.getAddress()))
            student1.setAddress(student.getAddress());

        return studentRepository.save(student1);
    }

    public Student getStudentById(UUID id) {

        return studentRepository.findById(id).get();
    }

    public void deleteStudentById(UUID id) {
        studentRepository.deleteById(id);
    }

    public Student addStudentToBranch(UUID id, Student student) {
        Student newStudent = studentRepository.findById(student.getStudentId()).orElse(studentRepository.save(student));
        Batch batch = batchRepository.findById(id).get();
        newStudent.setBatch(batch);
        return studentRepository.save(newStudent);
    }
}
