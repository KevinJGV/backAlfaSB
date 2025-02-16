package com.vin.back.domain.model;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "notifications")
public class notificationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name ="iduseraction", nullable = false)
    private userEntity userActionEntity;

    @ManyToOne
    @JoinColumn(name ="idusernotificated", nullable = false)
    private userEntity userNotificatedEntity;

    @ManyToOne
    @JoinColumn(name = "idlike")
    private likeEntity likeEntity;
    
    @ManyToOne
    @JoinColumn(name = "idfollow")
    private followEntity followEntity;

    @ManyToOne
    @JoinColumn(name = "idtag")
    private tagEntity tagEntity;

    @ManyToOne
    @JoinColumn(name = "idcomment")
    private commentEntity commentEntity;

    private LocalTime createdAt;

    public notificationEntity() {
    }

    public notificationEntity(Long id, userEntity userActionEntity, userEntity userNotificatedEntity,
            com.vin.back.domain.model.likeEntity likeEntity, com.vin.back.domain.model.followEntity followEntity,
            com.vin.back.domain.model.tagEntity tagEntity, com.vin.back.domain.model.commentEntity commentEntity,
            LocalTime createdAt) {
        this.id = id;
        this.userActionEntity = userActionEntity;
        this.userNotificatedEntity = userNotificatedEntity;
        this.likeEntity = likeEntity;
        this.followEntity = followEntity;
        this.tagEntity = tagEntity;
        this.commentEntity = commentEntity;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public userEntity getUserActionEntity() {
        return userActionEntity;
    }

    public void setUserActionEntity(userEntity userActionEntity) {
        this.userActionEntity = userActionEntity;
    }

    public userEntity getUserNotificatedEntity() {
        return userNotificatedEntity;
    }

    public void setUserNotificatedEntity(userEntity userNotificatedEntity) {
        this.userNotificatedEntity = userNotificatedEntity;
    }

    public likeEntity getLikeEntity() {
        return likeEntity;
    }

    public void setLikeEntity(likeEntity likeEntity) {
        this.likeEntity = likeEntity;
    }

    public followEntity getFollowEntity() {
        return followEntity;
    }

    public void setFollowEntity(followEntity followEntity) {
        this.followEntity = followEntity;
    }

    public tagEntity getTagEntity() {
        return tagEntity;
    }

    public void setTagEntity(tagEntity tagEntity) {
        this.tagEntity = tagEntity;
    }

    public commentEntity getCommentEntity() {
        return commentEntity;
    }

    public void setCommentEntity(commentEntity commentEntity) {
        this.commentEntity = commentEntity;
    }

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "notificationEntity [id=" + id + ", userActionEntity=" + userActionEntity + ", userNotificatedEntity="
                + userNotificatedEntity + ", likeEntity=" + likeEntity + ", followEntity=" + followEntity
                + ", tagEntity=" + tagEntity + ", commentEntity=" + commentEntity + ", createdAt=" + createdAt + "]";
    }

}
