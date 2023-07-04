package com.global.exception.advise;

import com.global.exception.exceptions.EmployeeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeExceptionAdvice {

    @ExceptionHandler(EmployeeException.class)
    public ResponseEntity<String> EmployeeExceptionHandler(EmployeeException e){
        return new ResponseEntity<>("Employee not found exception", HttpStatus.NOT_FOUND);
    }
}
