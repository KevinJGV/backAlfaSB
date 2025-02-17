package com.vin.back.application.port.in.sessionCasesUse;

import com.vin.back.domain.model.UserEntity;

public interface SignupCaseUse {
    boolean signup(UserEntity user);
}
