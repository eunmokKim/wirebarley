package com.example.wirebarley.exception;

import com.example.wirebarley.api.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExceptionConfiguration {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ApiResponse methodNotValidError(MethodArgumentNotValidException e){
        return ApiResponse.error(e.getFieldError().getDefaultMessage());
    }
}
