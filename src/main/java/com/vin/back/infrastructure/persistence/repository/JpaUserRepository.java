package com.vin.back.infrastructure.persistence.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vin.back.application.port.out.authPort.searchUserPort;
import com.vin.back.application.port.out.respository.JpaUsersRepositoryInterface;
import com.vin.back.domain.model.userEntity;
import com.vin.back.infrastructure.exception.NotFoundEmailException;
import com.vin.back.infrastructure.exception.NotFoundUsernameException;

@Repository
public class JpaUserRepository implements searchUserPort{
    @Autowired
    private JpaUsersRepositoryInterface repository;

    @Override
    public Optional<userEntity> searchEmail(String email) {
        return Optional.of(repository.findByEmail(email).orElseThrow(() -> 
             new NotFoundEmailException("Nombre de usuario desconocido.")));
    }

    @Override
    public Optional<userEntity> searchUsername(String username) {
        return Optional.of(repository.findByUsername(username).orElseThrow(() -> 
            new NotFoundUsernameException("Nombre de usuario desconocido.")));
    }
}
