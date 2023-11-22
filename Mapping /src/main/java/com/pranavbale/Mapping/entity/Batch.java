package com.pranavbale.Mapping.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Batch {

    @Id
    @GeneratedValue
    private UUID batchId;

    private String name;
    private String teacherName;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;


}
