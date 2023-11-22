package com.pranavbale.Mapping.service;

import com.pranavbale.Mapping.entity.Batch;
import com.pranavbale.Mapping.entity.Teacher;
import com.pranavbale.Mapping.repository.BatchRepository;
import com.pranavbale.Mapping.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.AbstractDocument;

@Service
public class BatchService {

    @Autowired
    BatchRepository batchRepository;

    @Autowired
    TeacherRepository teacherRepository;


    public Batch addBatch(Batch batch) {

        teacherRepository.save(batch.getTeacher());
        
        return batchRepository.save(batch);
    }
}
