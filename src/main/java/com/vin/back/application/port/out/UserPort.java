package com.vin.back.application.port.out;

import java.util.List;

import com.vin.back.application.port.out.common.SavePort;
import com.vin.back.domain.model.userEntity;

public interface UserPort extends SavePort<userEntity> {
    userEntity getByEmail(String email);
    userEntity getByUsername(String username);
    List<userEntity> getFollowers(String username);
    List<userEntity> getFollowed(String username);
}