package com.pranavbale.Mapping.controller;

import com.pranavbale.Mapping.entity.Batch;
import com.pranavbale.Mapping.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("batch")
public class BatchController {

    @Autowired
    BatchService batchService;

    // adding a new batch
    @PostMapping("/add")
    private ResponseEntity<Batch> addBatch(@RequestBody Batch batch) {
        return new ResponseEntity<>(batchService.addBatch(batch), HttpStatus.CREATED);
    }

    // update batch by id
    @PutMapping("/update/{id}")
    private ResponseEntity<Batch> updateBatch(@PathVariable UUID id, @RequestBody Batch batch) {
        return new ResponseEntity<>(batchService.updateById(id, batch), HttpStatus.OK);
    }

    // gating a new branch
    @GetMapping("/getById/{id}")
    private ResponseEntity<Batch> getBatchById(@PathVariable UUID id) {
        return new ResponseEntity<>(batchService.getBatchById(id), HttpStatus.OK);
    }

    // get all branches
    @GetMapping("getAll")
    private ResponseEntity<List<Batch>> getAllBatches() {
        return new ResponseEntity<>(batchService.getAllBatches(), HttpStatus.OK);
    }

    // delete the batch by id
    @DeleteMapping("deleteById/{id}")
    private ResponseEntity<String> deleteBatchById(@PathVariable UUID id) {
        batchService.deleteBatchById(id);
        return new ResponseEntity<>("Batch is deleted : " + id,HttpStatus.OK);
    }

}
