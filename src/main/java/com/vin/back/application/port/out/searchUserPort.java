package com.vin.back.application.port.out;

import com.vin.back.domain.model.userEntity;

public interface searchUserPort {
    userEntity searchEmail(String email);
    userEntity searchUsername(String username);
}
