package com.vin.back.infrastructure.persistence.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vin.back.application.port.out.savePort;
import com.vin.back.application.port.out.searchUserPort;
import com.vin.back.application.port.out.respository.JpaUsersRepositoryInterface;
import com.vin.back.domain.model.userEntity;

@Repository
public class JpaUserRepository implements searchUserPort, savePort{
    @Autowired
    private JpaUsersRepositoryInterface repository;

    @Override
    public Optional<userEntity> searchEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Optional<userEntity> searchUsername(String username) {
        return repository.findByUsername(username);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T save(T entity) {
        return (T) repository.save((userEntity) entity);
    }
}

