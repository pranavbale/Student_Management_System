package com.pranavbale.StudentManagementSystem.service;

import com.pranavbale.StudentManagementSystem.dto.LoginUserDto;
import com.pranavbale.StudentManagementSystem.dto.UserDetailDto;
import com.pranavbale.StudentManagementSystem.dto.UserDto;
import com.pranavbale.StudentManagementSystem.entity.User;
import com.pranavbale.StudentManagementSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    // resister a new user
    public UserDetailDto resisterUser(UserDto userDto) {

        User user = User.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getListName())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .role(userDto.getRole())
                .build();
        User savedUser = userRepository.save(user);
        return UserDetailDto.builder()
                .id(savedUser.getId())
                .firstName(savedUser.getFirstName())
                .lastName(savedUser.getLastName())
                .email(savedUser.getEmail())
                .role(savedUser.getRole())
                .build();
    }

    public UserDetailDto loginUser(LoginUserDto loginUserDto) {
        User user = userRepository.findByEmail(loginUserDto.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (Objects.equals(user.getPassword(), loginUserDto.getPassword()) &&
                Objects.equals(user.getRole(), loginUserDto.getRole())) {

            return UserDetailDto.builder()
                    .id(user.getId())
                    .firstName(user.getFirstName())
                    .lastName(user.getLastName())
                    .email(user.getEmail())
                    .role(user.getRole())
                    .build();
        }

        throw new RuntimeException("Invalid credentials");
    }

}
