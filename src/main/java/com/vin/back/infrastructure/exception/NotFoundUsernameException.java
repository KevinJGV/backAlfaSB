package com.vin.back.infrastructure.exception;

public class NotFoundUsernameException extends RuntimeException{
    public NotFoundUsernameException(String msg) {
        super(msg);
    }
}
