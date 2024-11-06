package com.exception.practice.globalexceptionhandling;

import com.exception.practice.UserDefinedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserDefinedException.class)
    public ResponseEntity<String> test(UserDefinedException u){
        return new ResponseEntity<>(u.getMessage(), HttpStatus.BAD_REQUEST);
    }


}
