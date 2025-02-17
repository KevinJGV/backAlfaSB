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
public class postEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "iduser")
    private userEntity userEntity;

    @Column(columnDefinition = "TEXT", length = 500)
    private String content;

    @Column(columnDefinition = "TEXT", nullable = true)
    private String imageAttached;

    private LocalDate uploadDate;

    private boolean modified = false;

    @OneToMany(mappedBy = "postEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<postHashtagEntity> postHashtagEntities = new ArrayList<>();

    @OneToMany(mappedBy = "postEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<likeEntity> likeEntities = new ArrayList<>();

    @OneToMany(mappedBy = "postEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<commentEntity> commentEntities = new ArrayList<>();

    public postEntity() {
    }

    public postEntity(Long id, com.vin.back.domain.model.userEntity userEntity, String content, String imageAttached,
            LocalDate uploadDate, boolean modified, List<postHashtagEntity> postHashtagEntities,
            List<likeEntity> likeEntities, List<commentEntity> commentEntities) {
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

    public userEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(userEntity userEntity) {
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

    public boolean isModified() {
        return modified;
    }

    public void setModified(boolean modified) {
        this.modified = modified;
    }

    public List<postHashtagEntity> getPostHashtagEntities() {
        return postHashtagEntities;
    }

    public void setPostHashtagEntities(List<postHashtagEntity> postHashtagEntities) {
        this.postHashtagEntities = postHashtagEntities;
    }

    public List<likeEntity> getLikeEntities() {
        return likeEntities;
    }

    public void setLikeEntities(List<likeEntity> likeEntities) {
        this.likeEntities = likeEntities;
    }

    public List<commentEntity> getCommentEntities() {
        return commentEntities;
    }

    public void setCommentEntities(List<commentEntity> commentEntities) {
        this.commentEntities = commentEntities;
    }

    @Override
    public String toString() {
        return "postEntity [id=" + id + ", userEntity=" + userEntity + ", content=" + content + ", imageAttached="
                + imageAttached + ", uploadDate=" + uploadDate + ", modified=" + modified + ", postHashtagEntities="
                + postHashtagEntities + ", likeEntities=" + likeEntities + ", commentEntities=" + commentEntities + "]";
    }

}
