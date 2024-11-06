package com.exception.practice;

public class UserDefinedException extends RuntimeException {

    private String message;

    public UserDefinedException(String message){
        super(message);
        this.message = message;
    }

}
