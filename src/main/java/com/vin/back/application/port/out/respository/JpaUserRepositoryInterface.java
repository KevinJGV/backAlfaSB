package com.vin.back.application.port.out.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vin.back.domain.model.userEntity;

public interface JpaUserRepositoryInterface extends JpaRepository<userEntity, Long>{
    userEntity findByEmail(String email);
    userEntity findByUsername(String username);
}
