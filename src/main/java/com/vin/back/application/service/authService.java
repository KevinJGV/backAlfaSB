package com.vin.back.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vin.back.application.port.out.authPort.searchUserPort;
import com.vin.back.application.exception.unknownUserException;
import com.vin.back.application.exception.unvalidatedCredentialException;
import com.vin.back.application.port.in.authCaseUse;
import com.vin.back.application.port.out.authPort.encoderPort;
import com.vin.back.application.port.out.authPort.tokenGenerator;
import com.vin.back.domain.model.userEntity;

@Service
public class authService implements authCaseUse{
    @Autowired
    private searchUserPort searchUserPort;
    @Autowired
    private encoderPort encoderPort;
    @Autowired
    private tokenGenerator tokenGenerator;
    public authService() {
    }

    @Override
    public String login(String username, String password) {
        userEntity usuario = searchUserPort.searchEmail(username).orElseThrow(
            () -> new unknownUserException("Usuario Desconocido")
        );

        if (!encoderPort.matches(username, password)) {
            throw new unvalidatedCredentialException("Credenciales incorrectas");
        }

        return tokenGenerator.generate(usuario);
    }
}
