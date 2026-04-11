package com.harsh.studentmanagement.exception;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(value={Exception.class})
    public String handleException(Exception ex){
        return "Error"+ex.getMessage();
    }


}
