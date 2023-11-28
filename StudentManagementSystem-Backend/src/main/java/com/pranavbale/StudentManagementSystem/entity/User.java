package com.pranavbale.StudentManagementSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User{

    @Id
    @GeneratedValue
    private UUID id;

    private  String firstName;

    private String listName;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

}
