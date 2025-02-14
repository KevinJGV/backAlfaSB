package com.vin.back.infrastructure.exception;

public class SecurityConfigException extends RuntimeException{

    public SecurityConfigException(String msg, Throwable e){
        super(msg, e);
    }
}
