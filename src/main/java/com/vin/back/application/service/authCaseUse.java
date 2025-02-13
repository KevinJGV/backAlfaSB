package com.vin.back.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vin.back.application.port.out.authPort.searchUserPort;
import com.vin.back.application.port.out.authPort.encoderPort;
import com.vin.back.application.port.out.authPort.tokenGenerator;
import com.vin.back.domain.model.userEntity;

@Service
public class authCaseUse {
    @Autowired
    private searchUserPort searchUserPort;
    @Autowired
    private encoderPort encoderPort;
    @Autowired
    private tokenGenerator tokenGenerator;
    public authCaseUse() {
    }

    public String init(String username, String password) {
        userEntity usuario = searchUserPort.searchEmail(username).orElseThrow(
            () -> new ("Usuario Desconocido")
        );

        if (!encoderPort.validate(username, password)) {
            throw new ("Credenciales incorrectas");
        }

        return tokenGenerator.generate(usuario);
    }
}
