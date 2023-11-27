package com.pranavbale.Mapping.service;

import com.pranavbale.Mapping.entity.Batch;
import com.pranavbale.Mapping.repository.BatchRepository;
import com.pranavbale.Mapping.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BatchService {

    @Autowired
    BatchRepository batchRepository;

    @Autowired
    TeacherRepository teacherRepository;


    public Batch addBatch(Batch batch) {
        if (batch.getTeacher() != null) {
            teacherRepository.save(batch.getTeacher());
        }
        return batchRepository.save(batch);
    }

    public Batch getBatchById(UUID id) {
        return batchRepository.findById(id).get();
    }

    public List<Batch> getAllBatches() {
        return (List<Batch>) batchRepository.findAll();
    }


    public void deleteBatchById(UUID id) {
        batchRepository.deleteById(id);
    }

    public Batch updateById(UUID id, Batch batch) {

        Batch newBatch = batchRepository.findById(id).get();

        if (!newBatch.getName().equals(batch.getName())) {
            newBatch.setName(batch.getName());
        }
        if (!newBatch.getCategory().equals(batch.getCategory())) {
            newBatch.setCategory(batch.getCategory());
        }

        return batchRepository.save(newBatch);
    }
}
