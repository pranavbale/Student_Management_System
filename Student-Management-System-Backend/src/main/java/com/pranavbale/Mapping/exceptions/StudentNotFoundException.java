package com.pranavbale.Mapping.exceptions;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.StandardException;

@StandardException
public class StudentNotFoundException extends Exception{
    private String massage;

    public StudentNotFoundException(String massage) {
        super(massage);
    }
}
