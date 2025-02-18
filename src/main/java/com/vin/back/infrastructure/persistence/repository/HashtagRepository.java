package com.vin.back.infrastructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vin.back.application.port.out.HashtagPort;
import com.vin.back.application.port.out.respository.JpaHashtagRepositoryInterface;
import com.vin.back.domain.model.HashtagEntity;

@Repository
public class HashtagRepository implements HashtagPort{
    @Autowired
    private JpaHashtagRepositoryInterface repository;

    @Override
    public HashtagEntity getByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public HashtagEntity save(HashtagEntity entity) {
        return repository.save(entity);
    }

    @Override
    public List<HashtagEntity> saveAll(List<HashtagEntity> hashtags) {
        return repository.saveAll(hashtags);
    }
}
