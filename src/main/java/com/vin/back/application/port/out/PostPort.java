package com.vin.back.application.port.out;

import java.util.List;

import com.vin.back.application.port.out.common.DeletePort;
import com.vin.back.application.port.out.common.FindAllPort;
import com.vin.back.application.port.out.common.FindByIdPort;
import com.vin.back.application.port.out.common.SavePort;
import com.vin.back.domain.model.PostEntity;
import com.vin.back.domain.model.UserEntity;

public interface PostPort extends FindByIdPort<PostEntity>, FindAllPort<PostEntity> ,SavePort<PostEntity> ,DeletePort<PostEntity>  {
    List<PostEntity> getByUser(UserEntity userEntity);
}
