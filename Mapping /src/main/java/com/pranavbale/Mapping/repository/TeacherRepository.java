package com.pranavbale.Mapping.repository;

import com.pranavbale.Mapping.entity.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface TeacherRepository extends CrudRepository<Teacher, UUID> {
}
