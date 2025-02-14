package com.vin.back.infrastructure.exception;

public class NotFoundEmailException extends RuntimeException{
    public NotFoundEmailException(String msg) {
        super(msg);
    }
}
