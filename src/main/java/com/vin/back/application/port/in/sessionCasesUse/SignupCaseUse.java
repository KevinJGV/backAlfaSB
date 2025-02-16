package com.vin.back.application.port.in.sessionCasesUse;

import com.vin.back.domain.model.userEntity;


public interface SignupCaseUse {
    boolean signup(userEntity user);
}
