package com.vin.back.infrastructure.persistence.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vin.back.application.port.out.PostPort;
import com.vin.back.application.port.out.respository.JpaPostRepositoryInterface;
import com.vin.back.domain.model.PostEntity;
import com.vin.back.domain.model.UserEntity;
import com.vin.back.infrastructure.exception.NotFoundPostException;

@Repository
public class PostRepository implements PostPort{
    @Autowired
    private JpaPostRepositoryInterface repository;

    @Override
    public PostEntity findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundPostException("Post Inexistente."));
    }

    @Override
    public List<PostEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<PostEntity> getByUser(UserEntity userEntity) {
        return repository.findAllByUserEntity(userEntity);
    }

    @Override
    public PostEntity save(PostEntity entity) {
        return repository.save(entity);
    }

    @Override
    public boolean delete(PostEntity entity) {
        try {
            repository.delete(entity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
