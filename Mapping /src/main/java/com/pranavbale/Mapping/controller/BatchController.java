package com.pranavbale.Mapping.controller;

import com.pranavbale.Mapping.entity.Batch;
import com.pranavbale.Mapping.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("batch")
public class BatchController {

    @Autowired
    BatchService batchService;

    @PostMapping("/add")
    private ResponseEntity<Batch> addBatch(@RequestBody Batch batch) {
        return new ResponseEntity<>(batchService.addBatch(batch), HttpStatus.CREATED);
    }

}
