package com.vin.back.domain.mapper;

import java.util.List;

import com.vin.back.application.dto.LikeDTO;
import com.vin.back.application.dto.ShortUserDTO;
import com.vin.back.domain.model.LikeEntity;

public class LikeMapper {
public static List<LikeDTO> toDTO(List<LikeEntity> likeEntity) {
        return likeEntity.stream().map(like -> {
            ShortUserDTO user = new ShortUserDTO(like.getUserEntity());
            return new LikeDTO(like.getId(), user);
        }).toList();
    }

    public static LikeDTO toDTO(LikeEntity likeEntity ) {
        ShortUserDTO user = new ShortUserDTO(likeEntity.getUserEntity());
        return new LikeDTO(likeEntity.getId(), user);
    }
}
