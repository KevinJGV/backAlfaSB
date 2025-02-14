package com.vin.back.application.port.out;

import java.util.Optional;

import com.vin.back.domain.model.userEntity;

public interface searchUserPort {
    Optional<userEntity> searchEmail(String email);
    Optional<userEntity> searchUsername(String username);
}
