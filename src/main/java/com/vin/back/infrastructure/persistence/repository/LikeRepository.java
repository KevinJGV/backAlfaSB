package com.vin.back.infrastructure.persistence.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vin.back.application.port.out.LikePort;
import com.vin.back.application.port.out.respository.JpaLikeRepositoryInterface;
import com.vin.back.domain.model.LikeEntity;
import com.vin.back.domain.model.PostEntity;
import com.vin.back.domain.model.UserEntity;

@Repository
public class LikeRepository implements LikePort{
    @Autowired
    private JpaLikeRepositoryInterface repository;

    @Override
    public boolean existsByPostEntityAndUserEntity(PostEntity post, UserEntity user) {
        return repository.existsByPostEntityAndUserEntity(post, user);
    }

    @Override
    public Optional<LikeEntity> getByPostEntityAndUserEntity(PostEntity post, UserEntity user) {
        return repository.findByPostEntityAndUserEntity(post, user);
    }

    @Override
    public void deleteByPostEntityAndUserEntity(PostEntity post, UserEntity user) {
        repository.deleteByPostEntityAndUserEntity(post, user);
    }

    @Override
    public LikeEntity save(LikeEntity likeEntity) {
        return repository.save(likeEntity);
    }

    @Override
    public void deleteByUserEntityAndPostEntity(UserEntity user, PostEntity post) {
        repository.deleteByUserEntityAndPostEntity(user, post);
    }
}
