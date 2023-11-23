package com.pranavbale.Mapping.service;

import com.pranavbale.Mapping.entity.Teacher;
import com.pranavbale.Mapping.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public Teacher addNewteacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher updateTeacher(UUID id, Teacher teacher) {
        Teacher teacher1 = teacherRepository.findById(id).get();

        if (teacher1.getName().equals(teacher.getName()))
            teacher1.setName(teacher.getName());

        return teacherRepository.save(teacher1);
    }

    public Teacher getTeacherById(UUID id) {
        return  teacherRepository.findById(id).get();
    }


    public List<Teacher> getAllTeachers() {
        return (List<Teacher>) teacherRepository.findAll();
    }

    public void deleteTeacherById(UUID id) {
        teacherRepository.deleteById(id);
    }
}
