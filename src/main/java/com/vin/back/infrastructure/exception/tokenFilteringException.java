package com.vin.back.infrastructure.exception;

public class tokenFilteringException extends RuntimeException{
    public tokenFilteringException(String msg, Throwable e) {
        super(msg, e);
    } 
}
