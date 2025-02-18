package com.vin.back.infrastructure.persistence.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vin.back.application.port.out.respository.JpaUserRepositoryInterface;
import com.vin.back.application.port.out.UserPort;
import com.vin.back.domain.model.UserEntity;
import com.vin.back.infrastructure.exception.UnknownUserException;

@Repository
public class UserRepository implements UserPort{
    @Autowired
    private JpaUserRepositoryInterface repository;

    @Override
    public UserEntity findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new UnknownUserException("Usuario desconocido."));
    }    

    @Override
    public UserEntity getByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public UserEntity getByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public List<UserEntity> getFollowers(String username) {
        return repository.findFollowersByUsername(username);
    }

    @Override
    public List<UserEntity> getFollowed(String username) {
        return repository.findFollowedByUsername(username);
    }

    @Override
    public UserEntity save(UserEntity entity) {
        return repository.save(entity);
    }
}

