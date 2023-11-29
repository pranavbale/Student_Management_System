package com.pranavbale.StudentManagementSystem.dto;

import com.pranavbale.StudentManagementSystem.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginUserDto {

    String email;
    String password;
    Role role;
}
