package com.vin.back.domain.mapper;

import java.util.ArrayList;
import java.util.List;

import com.vin.back.application.dto.HashtagDTO;
import com.vin.back.domain.model.HashtagEntity;
import com.vin.back.domain.model.PostEntity;
import com.vin.back.domain.model.PostHashtagEntity;

public class PostHashtagMapper {
    public static List<PostHashtagEntity> toEntity(List<HashtagDTO> hashtagDTOs, PostEntity postEntity) {
        return hashtagDTOs.stream().map(hashtagDTO -> {
            PostHashtagEntity postHashtagEntity = new PostHashtagEntity();
            postHashtagEntity.setPostEntity(postEntity);

            HashtagEntity hashtagEntity = new HashtagEntity(hashtagDTO.getId(), hashtagDTO.getName(), new ArrayList<>());
            postHashtagEntity.setHashtagEntity(hashtagEntity);

            return postHashtagEntity;
        }).toList();
    }

    public static PostHashtagEntity toEntity(HashtagDTO hashtagDTO, PostEntity postEntity) {
        PostHashtagEntity postHashtagEntity = new PostHashtagEntity();
        postHashtagEntity.setPostEntity(postEntity);

        HashtagEntity hashtagEntity = new HashtagEntity(hashtagDTO.getId(), hashtagDTO.getName(), new ArrayList<>());
        postHashtagEntity.setHashtagEntity(hashtagEntity);

        return postHashtagEntity;
    }
}
