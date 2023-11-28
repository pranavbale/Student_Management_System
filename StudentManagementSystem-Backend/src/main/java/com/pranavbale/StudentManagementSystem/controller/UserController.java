package com.pranavbale.StudentManagementSystem.controller;

import com.pranavbale.StudentManagementSystem.dto.UserDto;
import com.pranavbale.StudentManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("User")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("resister")
    private ResponseEntity<UserDto> resisterUser(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(userService.userDto, HttpStatus.CREATED);
    }
}
