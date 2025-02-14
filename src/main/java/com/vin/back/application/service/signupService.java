package com.vin.back.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vin.back.application.port.in.signupCaseUse;
import com.vin.back.application.port.out.savePort;
import com.vin.back.application.port.out.searchUserPort;
import com.vin.back.application.port.out.authPort.encoderPort;
import com.vin.back.domain.model.userEntity;

@Service
public class signupService implements signupCaseUse{
    @Autowired
    private searchUserPort searchUserPort;
    @Autowired
    private encoderPort encoderPort;
    @Autowired
    private savePort savePort;

    @Override
    public boolean signup(userEntity user) {
        userEntity findedUser = searchUserPort.searchEmail(user.getEmail());
        if (findedUser == null) {
            user.setPassword(encoderPort.encode(user.getPassword()));
            savePort.save(user);
            return true;
        }
        return false;
    }
}
