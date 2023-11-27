package com.pranavbale.Mapping.exceptions;

import lombok.experimental.StandardException;

@StandardException
public class TeacherNotFoundException extends Exception{

    private String message;

    public TeacherNotFoundException() {}

    public TeacherNotFoundException(String message) {
        super(message);
    }
}
