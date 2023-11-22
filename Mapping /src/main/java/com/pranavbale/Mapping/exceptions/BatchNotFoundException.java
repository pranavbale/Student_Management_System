package com.pranavbale.Mapping.exceptions;

import lombok.experimental.StandardException;

@StandardException
public class BatchNotFoundException extends Exception{

    private String message;

    public BatchNotFoundException() {
    }

    public BatchNotFoundException(String message) {
        super(message);
    }
}
