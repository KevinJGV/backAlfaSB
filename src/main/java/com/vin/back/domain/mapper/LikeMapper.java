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

    public static LikeEntity toEntity(LikeDTO likeDTO) {
        LikeEntity entity = new LikeEntity();
        entity.setId(likeDTO.getId());
        entity.setUserEntity(UserMapper.toEntity(likeDTO.getUser()));
        return entity;
    }

    public static List<LikeEntity> toEntity(List<LikeDTO> likeDTOs) {
        return likeDTOs.stream().map(likeDTO -> {
            LikeEntity entity = new LikeEntity();
            entity.setId(likeDTO.getId());
            entity.setUserEntity(UserMapper.toEntity(likeDTO.getUser()));
            return entity;
        }).toList();
    }
}
