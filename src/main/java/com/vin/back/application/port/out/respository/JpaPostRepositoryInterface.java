package com.vin.back.application.port.out.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vin.back.domain.model.PostEntity;
import com.vin.back.domain.model.UserEntity;

public interface JpaPostRepositoryInterface extends JpaRepository<PostEntity,Long>{
    List<PostEntity> findAllByUserEntities(UserEntity userEntity);
}
