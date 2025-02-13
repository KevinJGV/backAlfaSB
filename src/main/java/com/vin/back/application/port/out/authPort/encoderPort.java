package com.vin.back.application.port.out.authPort;

public interface encoderPort {
    boolean validate(String loginPassword, String savedPassword);
}
