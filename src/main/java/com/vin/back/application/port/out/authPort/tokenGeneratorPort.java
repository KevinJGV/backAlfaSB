package com.vin.back.application.port.out.authPort;

import com.vin.back.domain.model.userEntity;

public interface tokenGeneratorPort {
    String generate(userEntity usuario);
    boolean validate(String token);
    String getUsernameToken(String token);
}
