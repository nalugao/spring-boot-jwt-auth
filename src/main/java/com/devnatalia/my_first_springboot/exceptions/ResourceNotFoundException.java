package com.devnatalia.my_first_springboot.exceptions;

public class ResourceNotFoundException extends  RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
