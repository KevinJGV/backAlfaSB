package com.vin.back.application.port.out;

import java.util.List;

import com.vin.back.application.port.out.common.SavePort;
import com.vin.back.domain.model.CommentEntity;
import com.vin.back.domain.model.PostEntity;
import com.vin.back.domain.model.UserEntity;

public interface CommentPort extends SavePort<CommentEntity> {
    boolean existsByPostEntityAndUserEntity(PostEntity post, UserEntity user);
    List<CommentEntity> getByPostEntity(PostEntity post);
}
