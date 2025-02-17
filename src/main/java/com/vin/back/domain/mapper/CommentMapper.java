package com.vin.back.domain.mapper;

import java.util.List;

import com.vin.back.application.dto.CommentDTO;
import com.vin.back.application.dto.ShortUserDTO;
import com.vin.back.application.dto.TagDTO;
import com.vin.back.domain.model.commentEntity;

public class CommentMapper {
public static List<CommentDTO> toDTO(List<commentEntity> commentEntities) {
        return commentEntities.stream().map(comment -> {
            ShortUserDTO user = new ShortUserDTO(comment.getUserEntity());
            List<TagDTO> tags = TagMapper.toDTO(comment.getTagEntities());
            return new CommentDTO(comment, user,tags);
        }).toList();
    }

    public static CommentDTO toDTO(commentEntity commentEntity ) {
        ShortUserDTO user = new ShortUserDTO(commentEntity.getUserEntity());
        List<TagDTO> tags = TagMapper.toDTO(commentEntity.getTagEntities());
        return new CommentDTO(commentEntity, user,tags);
    }
}
