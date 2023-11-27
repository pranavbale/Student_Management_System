package com.pranavbale.Mapping.repository;

import com.pranavbale.Mapping.entity.Batch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BatchRepository extends CrudRepository<Batch, UUID> {
}
