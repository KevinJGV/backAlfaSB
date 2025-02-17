package com.vin.back.application.dto;

import java.util.List;

import com.vin.back.domain.model.CommentEntity;

public class CommentDTO {
    private Long id;
    private Long rawPostId;
    private Long rawUserId;

    private ShortUserDTO user;

    private List<TagDTO> tags;

    private String content;

    public CommentDTO() {
    }

    public CommentDTO(CommentEntity comment, ShortUserDTO user, List<TagDTO> tags) {
        this.id = comment.getId();
        this.user = user;
        this.tags = tags;
        this.content = comment.getContent();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRawPostId() {
        return rawPostId;
    }

    public void setRawPostId(Long rawPostId) {
        this.rawPostId = rawPostId;
    }

    public Long getRawUserId() {
        return rawUserId;
    }

    public void setRawUserId(Long rawUserId) {
        this.rawUserId = rawUserId;
    }

    public ShortUserDTO getUser() {
        return user;
    }

    public void setUser(ShortUserDTO user) {
        this.user = user;
    }

    public List<TagDTO> getTags() {
        return tags;
    }

    public void setTags(List<TagDTO> tags) {
        this.tags = tags;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CommentDTO [id=" + id + ", rawPostId=" + rawPostId + ", rawUserId=" + rawUserId + ", user=" + user
                + ", tags=" + tags + ", content=" + content + "]";
    }

}
