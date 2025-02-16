package com.vin.back.infrastructure.persistence.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vin.back.application.port.out.respository.JpaUserRepositoryInterface;
import com.vin.back.application.port.out.UserPort;
import com.vin.back.application.port.out.common.SavePort;
import com.vin.back.domain.model.userEntity;

@Repository
public class JpaUserRepository implements UserPort, SavePort<userEntity>{
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

    @Override
    public userEntity save(userEntity entity) {
        return repository.save((userEntity) entity);
    }
}

