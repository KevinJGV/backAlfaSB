package com.vin.back.domain.mapper;

import java.util.List;

import com.vin.back.application.dto.ShortUserDTO;
import com.vin.back.domain.model.UserEntity;

public class UserMapper {
    public static List<ShortUserDTO> toDTO(List<UserEntity> userEntities) {
        return userEntities.stream().map(user -> new ShortUserDTO(user)).toList();
    }

    public static ShortUserDTO toDTO(UserEntity userEntity) {
        return new ShortUserDTO(userEntity);
    }
}
