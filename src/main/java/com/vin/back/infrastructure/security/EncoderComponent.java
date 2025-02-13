package com.vin.back.infrastructure.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.vin.back.application.port.out.authPort.encoderPort;

@Component
public class EncoderComponent implements encoderPort{
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();   

    @Override
    public boolean validate(String loginPassword, String savedPassword) {
        return encoder.matches(loginPassword, savedPassword);
    }
}
