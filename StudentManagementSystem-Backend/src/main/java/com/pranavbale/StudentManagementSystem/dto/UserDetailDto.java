package com.pranavbale.StudentManagementSystem.dto;

import com.pranavbale.StudentManagementSystem.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDetailDto {
    UUID id;
    String firstName;
    String lastName;
    String email;
    Role role; 

}
