package com.vin.back.application.exception;

public class unknownUserException extends RuntimeException  {
    public unknownUserException(String msg) {
        super(msg);
    }

}
