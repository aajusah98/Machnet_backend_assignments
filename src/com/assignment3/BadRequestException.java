package com.assignment3;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String errorMessage) {
        super(errorMessage);
    }
}