package com.vin.back.domain.mapper;

import java.util.List;

import com.vin.back.application.dto.ShortUserDTO;
import com.vin.back.domain.model.userEntity;

public class UserMapper {
    public static List<ShortUserDTO> toDTO(List<userEntity> userEntities) {
        return userEntities.stream().map(user -> new ShortUserDTO(user)).toList();
    }

    public static ShortUserDTO toDTO(userEntity userEntity) {
        return new ShortUserDTO(userEntity);
    }
}
