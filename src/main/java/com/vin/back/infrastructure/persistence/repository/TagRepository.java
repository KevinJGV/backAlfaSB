package com.vin.back.infrastructure.persistence.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vin.back.application.port.out.TagPort;
import com.vin.back.application.port.out.respository.JpaTagRepositoryInterface;
import com.vin.back.domain.model.TagEntity;

@Repository
public class TagRepository implements TagPort{
    
    @Autowired
    private JpaTagRepositoryInterface repository;

    @Override
    public List<TagEntity> setAll(List<TagEntity> tags) {
        return repository.saveAll(tags);
    }

}
