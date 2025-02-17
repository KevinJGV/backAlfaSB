package com.vin.back.infrastructure.persistence.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vin.back.application.port.out.PostPort;
import com.vin.back.application.port.out.respository.JpaPostRepositoryInterface;
import com.vin.back.domain.model.postEntity;
import com.vin.back.domain.model.userEntity;
import com.vin.back.infrastructure.exception.NotFoundPostException;

@Repository
public class JpaPostRepository implements PostPort{
    @Autowired
    private JpaPostRepositoryInterface repository;

    @Override
    public postEntity findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundPostException("Post Inexistente."));
    }

    @Override
    public List<postEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<postEntity> getByUser(userEntity userEntity) {
        return repository.findAllByUserEntities(userEntity);
    }

    @Override
    public postEntity save(postEntity entity) {
        return repository.save(entity);
    }

    @Override
    public boolean delete(postEntity entity) {
        try {
            repository.delete(entity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
