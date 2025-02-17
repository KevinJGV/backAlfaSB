package com.vin.back.application.port.out.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vin.back.domain.model.HashtagEntity;

public interface JpaHashtagRepositoryInterface extends JpaRepository<HashtagEntity,Long> {
    HashtagEntity findByName(String name);
}
