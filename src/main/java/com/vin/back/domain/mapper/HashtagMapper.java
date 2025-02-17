package com.vin.back.domain.mapper;

import java.util.List;


import com.vin.back.application.dto.HashtagDTO;
import com.vin.back.domain.model.HashtagEntity;
import com.vin.back.domain.model.PostHashtagEntity;

public class HashtagMapper {
    public static List<HashtagDTO> toDTO(List<HashtagEntity> hashtagEntities ) {
        return hashtagEntities.stream().map(hashtag -> new HashtagDTO(hashtag.getId(),hashtag.getName())).toList();
    }

    public static HashtagDTO toDTO(HashtagEntity hashtagEntity) {
        return new HashtagDTO(hashtagEntity.getId(),hashtagEntity.getName());
    }

    public static List<HashtagDTO> toDTOFromPH(List<PostHashtagEntity> Entities ) {
        return Entities.stream().map(Entity -> new HashtagDTO(Entity.getHashtagEntity().getId(), Entity.getHashtagEntity().getName())).toList();
    }

    public static List<HashtagEntity> toEntity(List<HashtagDTO> hashtagDTOs) {
        return hashtagDTOs.stream().map(hashtag -> {
            HashtagEntity entity = new HashtagEntity();
            entity.setId(hashtag.getId());
            entity.setName(hashtag.getName());
            return entity;
        }).toList();
    }

    public static HashtagEntity toEntity(HashtagDTO hashtagDTO) {
        HashtagEntity entity = new HashtagEntity();
        entity.setId(hashtagDTO.getId());
        entity.setName(hashtagDTO.getName());
        return entity;
    }
}
