package com.vin.back.application.port.out.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vin.back.domain.model.postHashtagEntity;

public interface JpaPostHashtagRepositoryInterface extends JpaRepository<postHashtagEntity,Long>{

}
