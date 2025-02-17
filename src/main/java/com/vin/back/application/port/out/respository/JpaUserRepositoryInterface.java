package com.vin.back.application.port.out.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.vin.back.domain.model.userEntity;

public interface JpaUserRepositoryInterface extends JpaRepository<userEntity, Long>{
    userEntity findByEmail(String email);
    userEntity findByUsername(String username);

    @Query("SELECT f.userFollowerEntity FROM followEntity f WHERE f.userFollowedEntity.username = :username")
    List<userEntity> findFollowersByUsername(@Param("username") String username);

    @Query("SELECT f.userFollowedEntity FROM followEntity f WHERE f.userFollowerEntity.username = :username")
    List<userEntity> findFollowedByUsername(@Param("username") String username);
}