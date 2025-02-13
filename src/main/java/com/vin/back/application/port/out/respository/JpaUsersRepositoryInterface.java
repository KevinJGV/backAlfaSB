package com.vin.back.application.port.out.respository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vin.back.domain.model.userEntity;

public interface JpaUsersRepositoryInterface extends JpaRepository<userEntity, Long> {
    Optional<userEntity> findbyEmail(String email);
    Optional<userEntity> findbyUsername(String username);
}
