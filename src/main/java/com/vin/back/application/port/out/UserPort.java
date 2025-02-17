package com.vin.back.application.port.out;

import java.util.List;

import com.vin.back.application.dto.FollowDTO;
import com.vin.back.application.port.out.common.FindByIdPort;
import com.vin.back.application.port.out.common.SavePort;
import com.vin.back.domain.model.UserEntity;

public interface UserPort extends SavePort<UserEntity>, FindByIdPort<UserEntity> {
    UserEntity getByEmail(String email);
    UserEntity getByUsername(String username);
    List<UserEntity> getFollowers(String username);
    List<UserEntity> getFollowed(String username);
    boolean setFollow(FollowDTO followDTO);
}