package com.vin.back.infrastructure.exception;

public class NotFoundPostException extends RuntimeException{
    public NotFoundPostException(String msg) {
        super(msg);
    }
}
