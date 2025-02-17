package com.vin.back.application.dto;

import java.util.List;

import com.vin.back.domain.model.commentEntity;

public class CommentDTO {
    private Long id;

    private ShortUserDTO user;

    private List<TagDTO> tags;

    private String content;

    public CommentDTO(commentEntity comment, ShortUserDTO user, List<TagDTO> tags) {
        this.id = comment.getId();
        this.user = user;
        this.tags = tags;
        this.content = comment.getContent();
    }

}
