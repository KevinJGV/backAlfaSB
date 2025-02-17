package com.vin.back.application.port.out.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vin.back.domain.model.NotificationEntity;

public interface JpaNotificationRepositoryInterface extends JpaRepository<NotificationEntity,Long>{

}
