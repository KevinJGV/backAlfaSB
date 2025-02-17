package com.vin.back.domain.mapper;

import java.util.List;

import com.vin.back.application.dto.CommentDTO;
import com.vin.back.application.dto.FollowDTO;
import com.vin.back.application.dto.LikeDTO;
import com.vin.back.application.dto.NotificationDTO;
import com.vin.back.application.dto.ShortUserDTO;
import com.vin.back.application.dto.TagDTO;
import com.vin.back.domain.model.NotificationEntity;

public class NotificationMapper {

    public static List<NotificationDTO> toDTO(List<NotificationEntity> notificationEntities) {
        return notificationEntities.stream().map(notification -> {
            ShortUserDTO userAction = UserMapper.toDTO(notification.getUserActionEntity());
            ShortUserDTO userNotified = UserMapper.toDTO(notification.getUserNotifiedEntity());
            LikeDTO like = notification.getLikeEntity() != null ? LikeMapper.toDTO(notification.getLikeEntity()) : null;
            FollowDTO follow = notification.getFollowEntity() != null
                    ? FollowMapper.toDTO(notification.getFollowEntity())
                    : null;
            TagDTO tag = notification.getTagEntity() != null ? TagMapper.toDTO(notification.getTagEntity()) : null;
            CommentDTO comment = notification.getCommentEntity() != null
                    ? CommentMapper.toDTO(notification.getCommentEntity())
                    : null;

            return new NotificationDTO(
                    notification.getId(),
                    userAction,
                    userNotified,
                    like,
                    follow,
                    tag,
                    comment,
                    notification.getCreatedAt());
        }).toList();
    }

    public static NotificationDTO toDTO(NotificationEntity notificationEntity) {
        ShortUserDTO userAction = UserMapper.toDTO(notificationEntity.getUserActionEntity());
        ShortUserDTO userNotified = UserMapper.toDTO(notificationEntity.getUserNotifiedEntity());
        LikeDTO like = notificationEntity.getLikeEntity() != null ? LikeMapper.toDTO(notificationEntity.getLikeEntity())
                : null;
        FollowDTO follow = notificationEntity.getFollowEntity() != null
                ? FollowMapper.toDTO(notificationEntity.getFollowEntity())
                : null;
        TagDTO tag = notificationEntity.getTagEntity() != null ? TagMapper.toDTO(notificationEntity.getTagEntity())
                : null;
        CommentDTO comment = notificationEntity.getCommentEntity() != null
                ? CommentMapper.toDTO(notificationEntity.getCommentEntity())
                : null;

        return new NotificationDTO(
                notificationEntity.getId(),
                userAction,
                userNotified,
                like,
                follow,
                tag,
                comment,
                notificationEntity.getCreatedAt());
    }

    public static NotificationEntity toEntity(NotificationDTO dto) {
        NotificationEntity entity = new NotificationEntity();
        entity.setId(dto.getId());
        entity.setUserActionEntity(UserMapper.toEntity(dto.getUserAction()));
        entity.setUserNotifiedEntity(UserMapper.toEntity(dto.getUserNotified()));
        entity.setLikeEntity(dto.getLike() != null ? LikeMapper.toEntity(dto.getLike()) : null);
        entity.setFollowEntity(dto.getFollow() != null ? FollowMapper.toEntity(dto.getFollow()) : null);
        entity.setTagEntity(dto.getTag() != null ? TagMapper.toEntity(dto.getTag()) : null);
        entity.setCommentEntity(dto.getComment() != null ? CommentMapper.toEntity(dto.getComment()) : null);
        entity.setCreatedAt(dto.getCreatedAt());
        return entity;
    }
}
