package com.vin.back.application.port.out.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vin.back.domain.model.postEntity;
import com.vin.back.domain.model.userEntity;

public interface JpaPostRepositoryInterface extends JpaRepository<postEntity,Long>{
    List<postEntity> findAllByUserEntities(userEntity userEntity);
}
