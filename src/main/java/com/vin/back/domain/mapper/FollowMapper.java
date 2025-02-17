package com.vin.back.domain.mapper;

import java.util.List;

import com.vin.back.application.dto.FollowDTO;
import com.vin.back.application.dto.ShortUserDTO;
import com.vin.back.domain.model.FollowEntity;

public class FollowMapper {
public static List<FollowDTO> toDTO(List<FollowEntity> followEntities) {
        return followEntities.stream().map(follow -> {
            ShortUserDTO followerUser = new ShortUserDTO(follow.getUserFollowerEntity());
            ShortUserDTO followedUser = new ShortUserDTO(follow.getUserFollowedEntity());
            return new FollowDTO(follow, followedUser, followerUser);
        }).toList();
    }

    public static FollowDTO toDTO(FollowEntity followEntity) {
            ShortUserDTO followerUser = new ShortUserDTO(followEntity.getUserFollowerEntity());
            ShortUserDTO followedUser = new ShortUserDTO(followEntity.getUserFollowedEntity());
            return new FollowDTO(followEntity, followedUser, followerUser);
    }

    public static FollowEntity toEntity(FollowDTO followDTO) {
        FollowEntity entity = new FollowEntity();
        entity.setId(followDTO.getId());
        entity.setUserFollowerEntity(UserMapper.toEntity(followDTO.getUserFollower()));
        entity.setUserFollowedEntity(UserMapper.toEntity(followDTO.getUserFollowed()));
        return entity;
    }
}
