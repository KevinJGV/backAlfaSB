package com.vin.back.infrastructure.persistence.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vin.back.application.port.out.NotificationPort;
import com.vin.back.application.port.out.respository.JpaNotificationRepositoryInterface;
import com.vin.back.domain.model.NotificationEntity;

@Repository
public class NotificationRepository implements NotificationPort{
    @Autowired
    private JpaNotificationRepositoryInterface repository;

    @Override
    public List<NotificationEntity> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
}
