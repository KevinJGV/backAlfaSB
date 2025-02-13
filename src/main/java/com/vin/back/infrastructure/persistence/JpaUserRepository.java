package com.vin.back.infrastructure.persistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vin.back.application.port.out.authPort.searchUserPort;
import com.vin.back.application.port.out.respository.JpaUsersRepositoryInterface;
import com.vin.back.domain.model.userEntity;

@Repository
public class JpaUserRepository implements searchUserPort{
    @Autowired
    private JpaUsersRepositoryInterface repository;

    @Override
    public Optional<userEntity> searchEmail(String email) {
        return repository.findbyEmail(email);
    }

    @Override
    public Optional<userEntity> searchUsername(String username) {
        return repository.findbyUsername(username).orElse(null);
    }
}
