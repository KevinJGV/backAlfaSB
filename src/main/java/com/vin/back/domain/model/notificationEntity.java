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
public class NotificationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name ="iduseraction", nullable = false)
    private UserEntity userActionEntity;

    @ManyToOne
    @JoinColumn(name ="idusernotificated", nullable = false)
    private UserEntity userNotificatedEntity;

    @ManyToOne
    @JoinColumn(name = "idlike")
    private LikeEntity likeEntity;
    
    @ManyToOne
    @JoinColumn(name = "idfollow")
    private FollowEntity followEntity;

    @ManyToOne
    @JoinColumn(name = "idtag")
    private TagEntity tagEntity;

    @ManyToOne
    @JoinColumn(name = "idcomment")
    private CommentEntity commentEntity;

    private LocalTime createdAt;

    public NotificationEntity() {
    }

    public NotificationEntity(Long id, UserEntity userActionEntity, UserEntity userNotificatedEntity,
            com.vin.back.domain.model.LikeEntity likeEntity, com.vin.back.domain.model.FollowEntity followEntity,
            com.vin.back.domain.model.TagEntity tagEntity, com.vin.back.domain.model.CommentEntity commentEntity,
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

    public UserEntity getUserActionEntity() {
        return userActionEntity;
    }

    public void setUserActionEntity(UserEntity userActionEntity) {
        this.userActionEntity = userActionEntity;
    }

    public UserEntity getUserNotificatedEntity() {
        return userNotificatedEntity;
    }

    public void setUserNotificatedEntity(UserEntity userNotificatedEntity) {
        this.userNotificatedEntity = userNotificatedEntity;
    }

    public LikeEntity getLikeEntity() {
        return likeEntity;
    }

    public void setLikeEntity(LikeEntity likeEntity) {
        this.likeEntity = likeEntity;
    }

    public FollowEntity getFollowEntity() {
        return followEntity;
    }

    public void setFollowEntity(FollowEntity followEntity) {
        this.followEntity = followEntity;
    }

    public TagEntity getTagEntity() {
        return tagEntity;
    }

    public void setTagEntity(TagEntity tagEntity) {
        this.tagEntity = tagEntity;
    }

    public CommentEntity getCommentEntity() {
        return commentEntity;
    }

    public void setCommentEntity(CommentEntity commentEntity) {
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
