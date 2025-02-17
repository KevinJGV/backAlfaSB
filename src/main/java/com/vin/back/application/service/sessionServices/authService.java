package com.vin.back.application.service.sessionServices;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vin.back.application.exception.UnvalidatedCredentialException;
import com.vin.back.application.port.in.sessionCasesUse.AuthCaseUse;
import com.vin.back.application.port.out.sesisonPort.EncoderPort;
import com.vin.back.application.port.out.sesisonPort.TokenGeneratorPort;
import com.vin.back.application.port.out.UserPort;
import com.vin.back.domain.model.UserEntity;

import jakarta.transaction.Transactional;

@Service
public class AuthService implements AuthCaseUse{
    @Autowired
    private UserPort UserPort;
    @Autowired
    private EncoderPort encoderPort;
    @Autowired
    private TokenGeneratorPort tokenGenerator;

    private final Set<String> invalidatedTokens = new HashSet<>();
    
    public AuthService() {
    }

    @Override
    public String login(String username, String password) {
        UserEntity user = UserPort.getByUsername(username);

        if (!encoderPort.matches(password, user.getPassword())) {
            throw new UnvalidatedCredentialException("Credenciales incorrectas");
        }

        return tokenGenerator.generate(user);
    }

    @Override
    @Transactional
    public void logout(String token) {
        invalidatedTokens.add(token);
    }

    @Override
    public boolean isTokenInvalidated(String token) {
        return invalidatedTokens.contains(token);
    }
}
