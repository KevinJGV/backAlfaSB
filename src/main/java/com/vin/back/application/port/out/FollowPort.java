package com.vin.back.application.port.out;

import java.util.Optional;

import com.vin.back.application.port.out.common.SavePort;
import com.vin.back.domain.model.FollowEntity;
import com.vin.back.domain.model.UserEntity;

public interface FollowPort extends SavePort<FollowEntity>{
    Optional<FollowEntity> getByFollowerAndFollowed(Long followerId, Long followedId);
    boolean existsByFollowerAndFollowed(UserEntity follower, UserEntity followed);
    void delete(FollowEntity followEntity);
}
