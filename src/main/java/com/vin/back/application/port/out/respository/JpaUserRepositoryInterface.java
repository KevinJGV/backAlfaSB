package com.vin.back.application.port.out.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.vin.back.domain.model.UserEntity;

public interface JpaUserRepositoryInterface extends JpaRepository<UserEntity, Long>{
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);

    @Query("SELECT f.userFollowerEntity FROM FollowEntity f WHERE f.userFollowedEntity.username = :username")
    List<UserEntity> findFollowersByUsername(@Param("username") String username);

    @Query("SELECT f.userFollowedEntity FROM FollowEntity f WHERE f.userFollowerEntity.username = :username")
    List<UserEntity> findFollowedByUsername(@Param("username") String username);
}