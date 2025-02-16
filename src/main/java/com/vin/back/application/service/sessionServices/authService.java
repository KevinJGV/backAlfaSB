package com.vin.back.application.service.sessionServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vin.back.application.exception.unvalidatedCredentialException;
import com.vin.back.application.port.in.sessionCasesUse.AuthCaseUse;
import com.vin.back.application.port.out.sesisonPort.EncoderPort;
import com.vin.back.application.port.out.sesisonPort.TokenGeneratorPort;
import com.vin.back.application.port.out.UserPort;
import com.vin.back.domain.model.userEntity;

@Service
public class AuthService implements AuthCaseUse{
    @Autowired
    private UserPort searchUserPort;
    @Autowired
    private EncoderPort encoderPort;
    @Autowired
    private TokenGeneratorPort tokenGenerator;
    public AuthService() {
    }

    @Override
    public String login(String username, String password) {
        userEntity user = searchUserPort.searchUsername(username);

        if (!encoderPort.matches(password, user.getPassword())) {
            throw new unvalidatedCredentialException("Credenciales incorrectas");
        }

        return tokenGenerator.generate(user);
    }
}
