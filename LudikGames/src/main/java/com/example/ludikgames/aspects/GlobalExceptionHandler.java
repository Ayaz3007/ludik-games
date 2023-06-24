package com.example.ludikgames.aspects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public String handleException(Exception ex) {

        Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
        logger.error("Произошло исключение", ex);

        return "redirect:/error";
    }
}
