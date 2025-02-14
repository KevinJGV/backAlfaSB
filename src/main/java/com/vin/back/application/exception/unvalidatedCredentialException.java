package com.vin.back.application.exception;

public class unvalidatedCredentialException extends RuntimeException {
    public unvalidatedCredentialException(String msg) {
        super(msg);
    }
}
