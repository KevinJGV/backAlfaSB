package com.vin.back.application.port.out;

import java.util.List;

import com.vin.back.application.port.out.common.DeletePort;
import com.vin.back.application.port.out.common.FindAllPort;
import com.vin.back.application.port.out.common.FindByIdPort;
import com.vin.back.application.port.out.common.SavePort;
import com.vin.back.domain.model.postEntity;
import com.vin.back.domain.model.userEntity;

public interface PostPort extends FindByIdPort<postEntity>, FindAllPort<postEntity> ,SavePort<postEntity> ,DeletePort<postEntity>  {
    List<postEntity> getByUser(userEntity userEntity);
}
