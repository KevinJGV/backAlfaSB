package com.vin.back.infrastructure.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vin.back.application.exception.UnvalidatedCredentialException;
import com.vin.back.infrastructure.exception.NotFoundEmailException;
import com.vin.back.infrastructure.exception.NotFoundUsernameException;
import com.vin.back.infrastructure.exception.SecurityConfigException;
import com.vin.back.infrastructure.exception.TokenFilteringException;
import com.vin.back.infrastructure.exception.UnknownUserException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // domain Exceptions

    // application Exceptions

    @ExceptionHandler(UnknownUserException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String unknownUserHandler(UnknownUserException e) {
        return e.getMessage();
    }
    
    @ExceptionHandler(UnvalidatedCredentialException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String unvalidatedCredentialHandler(UnvalidatedCredentialException e) {
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

    @ExceptionHandler(TokenFilteringException.class)
    public ResponseEntity<String> tokenFilteringException(TokenFilteringException e) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Token inválido o expirado.");
    }
    // @ExceptionHandler(.class)
    // @ResponseStatus(HttpStatus.)
    // public String ( e) {
    //     return e.getMessage();
    // }
}
