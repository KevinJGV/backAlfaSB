package com.vin.back.infrastructure.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vin.back.application.exception.unknownUserException;
import com.vin.back.application.exception.unvalidatedCredentialException;
import com.vin.back.infrastructure.exception.NotFoundEmailException;
import com.vin.back.infrastructure.exception.NotFoundUsernameException;
import com.vin.back.infrastructure.exception.SecurityConfigException;
import com.vin.back.infrastructure.exception.tokenFilteringException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // domain Exceptions

    // application Exceptions

    @ExceptionHandler(unknownUserException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String unknownUserHandler(unknownUserException e) {
        return e.getMessage();
    }
    
    @ExceptionHandler(unvalidatedCredentialException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String unvalidatedCredentialHandler(unvalidatedCredentialException e) {
        return e.getMessage();
    }

    // infrastructure Exceptions

    @ExceptionHandler(NotFoundEmailException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String NotFoundEmailHandler(NotFoundEmailException e) {
        return e.getMessage();
    }

    @ExceptionHandler(NotFoundUsernameException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String NotFoundUsernameHandler(NotFoundUsernameException e) {
        return e.getMessage();
    }

    @ExceptionHandler(SecurityConfigException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String SecurityConfigException(SecurityConfigException e) {
        return e.getMessage();
    }

    @ExceptionHandler(tokenFilteringException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String tokenFilteringException(tokenFilteringException e) {
        return e.getMessage();
    }
    // @ExceptionHandler(.class)
    // @ResponseStatus(HttpStatus.)
    // public String ( e) {
    //     return e.getMessage();
    // }
}
