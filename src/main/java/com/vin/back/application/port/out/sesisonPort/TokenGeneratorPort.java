package com.vin.back.application.port.out.sesisonPort;

import com.vin.back.domain.model.UserEntity;

public interface TokenGeneratorPort {
    String generate(UserEntity usuario);
    boolean validate(String token);
    String getUsernameToken(String token);
}
