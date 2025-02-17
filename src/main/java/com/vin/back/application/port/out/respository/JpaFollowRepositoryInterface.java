package com.vin.back.application.port.out.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vin.back.domain.model.FollowEntity;
import com.vin.back.domain.model.UserEntity;

public interface JpaFollowRepositoryInterface extends JpaRepository<FollowEntity,Long> {
    Optional<FollowEntity> findByUserFollowerEntityIdAndUserFollowedEntityId(Long followerId, Long followedId);
    boolean existsByUserFollowerEntityAndUserFollowedEntity(UserEntity follower, UserEntity followed);
}
