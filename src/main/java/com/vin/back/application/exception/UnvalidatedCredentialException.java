package com.vin.back.application.exception;

public class UnvalidatedCredentialException extends RuntimeException {
    public UnvalidatedCredentialException(String msg) {
        super(msg);
    }
}
