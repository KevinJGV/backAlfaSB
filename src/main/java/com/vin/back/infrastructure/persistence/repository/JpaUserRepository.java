package com.vin.back.infrastructure.persistence.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vin.back.application.port.out.respository.JpaUserRepositoryInterface;
import com.vin.back.application.port.out.UserPort;
import com.vin.back.domain.model.userEntity;

@Repository
public class JpaUserRepository implements UserPort{
    @Autowired
    private JpaUserRepositoryInterface repository;

    @Override
    public userEntity getByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public userEntity getByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public List<userEntity> getFollowers(String username) {
        return repository.findFollowersByUsername(username);
    }

    @Override
    public List<userEntity> getFollowed(String username) {
        return repository.findFollowedByUsername(username);
    }

    @Override
    public userEntity save(userEntity entity) {
        return repository.save(entity);
    }    
}

