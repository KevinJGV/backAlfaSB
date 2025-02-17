package com.vin.back.domain.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "posts")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "iduser")
    private UserEntity userEntity;

    @Column(columnDefinition = "TEXT", length = 500)
    private String content;

    @Column(columnDefinition = "TEXT", nullable = true)
    private String imageAttached;

    private LocalDate uploadDate;
    
    @Column(nullable = true)
    private Boolean modified = false;

    @OneToMany(mappedBy = "postEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PostHashtagEntity> postHashtagEntities = new ArrayList<>();

    @OneToMany(mappedBy = "postEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LikeEntity> likeEntities = new ArrayList<>();

    @OneToMany(mappedBy = "postEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CommentEntity> commentEntities = new ArrayList<>();

    public PostEntity() {
    }

    public PostEntity(Long id, com.vin.back.domain.model.UserEntity userEntity, String content, String imageAttached,
            LocalDate uploadDate, boolean modified, List<PostHashtagEntity> postHashtagEntities,
            List<LikeEntity> likeEntities, List<CommentEntity> commentEntities) {
        this.id = id;
        this.userEntity = userEntity;
        this.content = content;
        this.imageAttached = imageAttached;
        this.uploadDate = uploadDate;
        this.modified = modified;
        this.postHashtagEntities = postHashtagEntities;
        this.likeEntities = likeEntities;
        this.commentEntities = commentEntities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
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

    public List<PostHashtagEntity> getPostHashtagEntities() {
        return postHashtagEntities;
    }

    public void setPostHashtagEntities(List<PostHashtagEntity> postHashtagEntities) {
        this.postHashtagEntities = postHashtagEntities;
    }

    public List<LikeEntity> getLikeEntities() {
        return likeEntities;
    }

    public void setLikeEntities(List<LikeEntity> likeEntities) {
        this.likeEntities = likeEntities;
    }

    public List<CommentEntity> getCommentEntities() {
        return commentEntities;
    }

    public void setCommentEntities(List<CommentEntity> commentEntities) {
        this.commentEntities = commentEntities;
    }

    @Override
    public String toString() {
        return "postEntity [id=" + id + ", userEntity=" + userEntity + ", content=" + content + ", imageAttached="
                + imageAttached + ", uploadDate=" + uploadDate + ", modified=" + modified + ", postHashtagEntities="
                + postHashtagEntities + ", likeEntities=" + likeEntities + ", commentEntities=" + commentEntities + "]";
    }

}
