package com.vin.back.application.service.sessionServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vin.back.application.port.in.sessionCasesUse.SignupCaseUse;
import com.vin.back.application.port.out.sesisonPort.EncoderPort;
import com.vin.back.application.port.out.UserPort;
import com.vin.back.application.port.out.common.SavePort;
import com.vin.back.domain.model.userEntity;

@Service
public class SignupService implements SignupCaseUse{
    @Autowired
    private UserPort searchUserPort;
    @Autowired
    private EncoderPort encoderPort;
    @Autowired
    private SavePort<userEntity> savePort;

    @Override
    public boolean signup(userEntity user) {
        userEntity findedUser = searchUserPort.getByEmail(user.getEmail());
        if (findedUser == null) {
            user.setPassword(encoderPort.encode(user.getPassword()));
            savePort.save(user);
            return true;
        }
        return false;
    }
}
