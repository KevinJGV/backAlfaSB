package com.vin.back.application.dto;

import java.time.LocalDate;
import java.util.List;

import com.vin.back.domain.model.PostEntity;

public class PostDTO {
    private Long id;

    private ShortUserDTO user;

    private String content;

    private String imageAttached;

    private LocalDate uploadDate;

    private Boolean modified;
    private List<HashtagDTO> hashtags;
    private List<String> rawHashtags;
    private List<LikeDTO> likes;
    private List<CommentDTO> comments;

    public PostDTO() {
    }

    public PostDTO(PostEntity post, ShortUserDTO userDTO, List<HashtagDTO> hashtags, List<LikeDTO> likes,
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShortUserDTO getUser() {
        return user;
    }

    public void setUser(ShortUserDTO user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageAttached() {
        return imageAttached;
    }

    public void setImageAttached(String imageAttached) {
        this.imageAttached = imageAttached;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Boolean isModified() {
        return modified;
    }

    public void setModified(boolean modified) {
        this.modified = modified;
    }

    public List<HashtagDTO> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<HashtagDTO> hashtags) {
        this.hashtags = hashtags;
    }

    public List<String> getRawHashtags() {
        return rawHashtags;
    }

    public void setRawHashtags(List<String> rawHashtags) {
        this.rawHashtags = rawHashtags;
    }

    public List<LikeDTO> getLikes() {
        return likes;
    }

    public void setLikes(List<LikeDTO> likes) {
        this.likes = likes;
    }

    public List<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "PostDTO [id=" + id + ", user=" + user + ", content=" + content + ", imageAttached=" + imageAttached
                + ", uploadDate=" + uploadDate + ", modified=" + modified + ", hashtags=" + hashtags + ", rawHashtags="
                + rawHashtags + ", likes=" + likes + ", comments=" + comments + "]";
    }

}
