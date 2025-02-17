package com.vin.back.domain.mapper;

import java.util.List;

import com.vin.back.application.dto.ShortUserDTO;
import com.vin.back.application.dto.TagDTO;
import com.vin.back.domain.model.TagEntity;

public class TagMapper {
public static List<TagDTO> toDTO(List<TagEntity> tagEntities) {
        return tagEntities.stream().map(tag -> {
            ShortUserDTO user = new ShortUserDTO(tag.getUserTaggedEntity());
            return new TagDTO(tag.getId(), user);
        }).toList();
    }

    public static TagDTO toDTO(TagEntity tagEntity) {
        ShortUserDTO user = new ShortUserDTO(tagEntity.getUserTaggedEntity());
        return new TagDTO(tagEntity.getId(), user);
    }
}
