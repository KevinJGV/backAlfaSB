package com.vin.back.domain.mapper;

import java.util.List;

import com.vin.back.application.dto.CommentDTO;
import com.vin.back.application.dto.ShortUserDTO;
import com.vin.back.application.dto.TagDTO;
import com.vin.back.domain.model.CommentEntity;

public class CommentMapper {
public static List<CommentDTO> toDTO(List<CommentEntity> commentEntities) {
        return commentEntities.stream().map(comment -> {
            ShortUserDTO user = new ShortUserDTO(comment.getUserEntity());
            List<TagDTO> tags = TagMapper.toDTO(comment.getTagEntities());
            return new CommentDTO(comment, user,tags);
        }).toList();
    }

    public static CommentDTO toDTO(CommentEntity commentEntity ) {
        ShortUserDTO user = new ShortUserDTO(commentEntity.getUserEntity());
        List<TagDTO> tags = TagMapper.toDTO(commentEntity.getTagEntities());
        return new CommentDTO(commentEntity, user,tags);
    }

    public static CommentEntity toEntity(CommentDTO commentDTO) {
        CommentEntity entity = new CommentEntity();
        entity.setId(commentDTO.getId());
        entity.setUserEntity(UserMapper.toEntity(commentDTO.getUser()));
        entity.setContent(commentDTO.getContent());
        entity.setTagEntities(TagMapper.toEntity(commentDTO.getTags()));
        return entity;
    }

    public static List<CommentEntity> toEntity(List<CommentDTO> commentDTOs) {
        return commentDTOs.stream().map(commentDTO -> {
            CommentEntity entity = new CommentEntity();
            entity.setId(commentDTO.getId());
            entity.setUserEntity(UserMapper.toEntity(commentDTO.getUser()));
            entity.setContent(commentDTO.getContent());
            entity.setTagEntities(TagMapper.toEntity(commentDTO.getTags()));
            return entity;
        }).toList();
    }
}
