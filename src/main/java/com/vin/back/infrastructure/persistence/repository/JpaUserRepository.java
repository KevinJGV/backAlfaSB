package com.vin.back.infrastructure.persistence.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vin.back.application.port.out.SavePort;
import com.vin.back.application.port.out.respository.JpaUserRepositoryInterface;
import com.vin.back.application.port.out.UserPort;
import com.vin.back.domain.model.userEntity;

@Repository
public class JpaUserRepository implements UserPort, SavePort{
    @Autowired
    private JpaUserRepositoryInterface repository;

    @Override
    public userEntity searchEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public userEntity searchUsername(String username) {
        return repository.findByUsername(username);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T save(T entity) {
        return (T) repository.save((userEntity) entity);
    }
}

