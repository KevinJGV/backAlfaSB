package com.vin.back.infrastructure.exception;

public class TokenFilteringException extends RuntimeException{
    public TokenFilteringException(String msg, Throwable e) {
        super(msg, e);
    } 
}
