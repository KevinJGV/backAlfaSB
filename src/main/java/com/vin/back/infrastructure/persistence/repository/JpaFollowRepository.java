package com.vin.back.infrastructure.persistence.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vin.back.application.port.out.respository.JpaFollowRepositoryInterface;

@Repository
public class JpaFollowRepository {
    @Autowired
    private JpaFollowRepositoryInterface repository;
}
