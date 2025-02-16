package com.vin.back.application.port.out.sesisonPort;

import com.vin.back.domain.model.userEntity;

public interface TokenGeneratorPort {
    String generate(userEntity usuario);
    boolean validate(String token);
    String getUsernameToken(String token);
}
