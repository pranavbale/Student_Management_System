package com.pranavbale.Mapping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Student {

    @Id
    @GeneratedValue
    private UUID studentId;

    @NotNull(message = "The name of the student must be present ")
    private String Name;
    @NotNull(message = "The email of the student must be present ")
    private String email;
    @NotNull(message = "Address must be present")
    private String address;


}
