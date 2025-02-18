package com.vin.back.application.port.out;

import java.util.Optional;

import com.vin.back.application.port.out.common.SavePort;
import com.vin.back.domain.model.LikeEntity;
import com.vin.back.domain.model.PostEntity;
import com.vin.back.domain.model.UserEntity;

public interface LikePort extends SavePort<LikeEntity> {
    boolean existsByPostEntityAndUserEntity(PostEntity post, UserEntity user);
    Optional<LikeEntity> getByPostEntityAndUserEntity(PostEntity post, UserEntity user);
    void deleteByPostEntityAndUserEntity(PostEntity post, UserEntity user);
}
