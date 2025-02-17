package com.vin.back.application.port.out.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vin.back.domain.model.LikeEntity;
import com.vin.back.domain.model.PostEntity;
import com.vin.back.domain.model.UserEntity;

public interface JpaLikeRepositoryInterface extends JpaRepository<LikeEntity,Long>{
    Optional<LikeEntity> findByPostEntityAndUserEntity(PostEntity post, UserEntity user);
    void deleteByPostEntityAndUserEntity(PostEntity post, UserEntity user);
}
