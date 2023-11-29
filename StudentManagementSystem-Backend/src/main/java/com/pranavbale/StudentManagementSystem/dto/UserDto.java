package com.pranavbale.StudentManagementSystem.dto;

import com.pranavbale.StudentManagementSystem.entity.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @NotNull(message = "Name must be present")
    private  String firstName;

    @NotNull(message = "Last name must be present")
    private String listName;

    @NotNull(message = "email must be valid")
    private String email;

    @NotNull(message = "password must be present")
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

}
