package com.pranavbale.StudentManagementSystem.controller;

import com.pranavbale.StudentManagementSystem.dto.LoginUserDto;
import com.pranavbale.StudentManagementSystem.dto.UserDetailDto;
import com.pranavbale.StudentManagementSystem.dto.UserDto;
import com.pranavbale.StudentManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("signUp")
    private ResponseEntity<UserDetailDto> resisterUser(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(userService.resisterUser(userDto), HttpStatus.CREATED);
    }

    @PostMapping("signIn")
    private ResponseEntity<UserDetailDto> loginUser(@RequestBody LoginUserDto loginUserDto) {
        return new ResponseEntity<>(userService.loginUser(loginUserDto), HttpStatus.OK);
    }

//    @PostMapping("/forgetPassword/{id}")
//    private ResponseEntity<UserDetailDto> forgetPassword(@RequestBody UserDetailDto userDetailDto, @PathVariable UUID id) {
//        return new ResponseEntity<>(userDetailDto.forgetPassword(userDetailDto, id), HttpStatus.OK);
//    }
}
