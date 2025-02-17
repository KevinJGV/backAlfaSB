package com.vin.back.application.dto;

import java.time.LocalDate;
import java.util.List;

import com.vin.back.domain.model.postEntity;

public class PostDTO {
    private Long id;

    private ShortUserDTO user;

    private String content;

    private String imageAttached;

    private LocalDate uploadDate;

    private boolean modified;
    private List<HashtagDTO> hashtags;
    private List<LikeDTO> likes;
    private List<CommentDTO> comments;

    public PostDTO(postEntity post, ShortUserDTO userDTO, List<HashtagDTO> hashtags, List<LikeDTO> likes,
            List<CommentDTO> comments) {
        this.id = post.getId();
        this.user = userDTO;
        this.content = post.getContent();
        this.imageAttached = post.getImageAttached();
        this.uploadDate = post.getUploadDate();
        this.modified = post.isModified();
        this.hashtags = hashtags;
        this.likes = likes;
        this.comments = comments;
    }
}
