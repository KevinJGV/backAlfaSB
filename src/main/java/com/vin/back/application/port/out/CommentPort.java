package com.vin.back.application.port.out;

import java.util.List;

import com.vin.back.application.port.out.common.SavePort;
import com.vin.back.domain.model.CommentEntity;
import com.vin.back.domain.model.PostEntity;

public interface CommentPort extends SavePort<CommentEntity> {
    List<CommentEntity> getByPostEntity(PostEntity post);
}
