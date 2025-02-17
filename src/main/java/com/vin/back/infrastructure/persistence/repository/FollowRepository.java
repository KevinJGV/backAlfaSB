package com.vin.back.infrastructure.persistence.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vin.back.application.port.out.FollowPort;
import com.vin.back.application.port.out.respository.JpaFollowRepositoryInterface;
import com.vin.back.domain.model.FollowEntity;
import com.vin.back.domain.model.UserEntity;

@Repository
public class FollowRepository implements FollowPort {
    @Autowired
    private JpaFollowRepositoryInterface repository;

    @Override
    public FollowEntity save(FollowEntity entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(FollowEntity entity) {
        repository.delete(entity);
    }

    @Override
    public Optional<FollowEntity> getByFollowerAndFollowed(Long followerId, Long followedId) {
        return repository.findByUserFollowerEntityIdAndUserFollowedEntityId(followerId, followedId);
    }

    @Override
    public boolean existsByFollowerAndFollowed(UserEntity follower, UserEntity followed) {
        return repository.existsByUserFollowerEntityAndUserFollowedEntity(follower, followed);
    }
}
