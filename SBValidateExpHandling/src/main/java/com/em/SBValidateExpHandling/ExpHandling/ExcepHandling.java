package com.em.SBValidateExpHandling.ExpHandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExcepHandling {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleInvalidArguement(MethodArgumentNotValidException ex){
        Map<String,String> errormessage =new HashMap<>();

        ex.getBindingResult().getFieldError().
        forEach(error ->{
            errormessage.put(error.getField().error.getDefaultMessage());
        });
       // errormessage.put("", ex.getMessage());
         return errormessage;

    }

}
