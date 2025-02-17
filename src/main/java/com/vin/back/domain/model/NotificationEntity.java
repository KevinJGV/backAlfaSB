package com.vin.back.domain.model;

import java.time.LocalDateTime;

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
    private UserEntity userNotifiedEntity;

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

    private LocalDateTime createdAt;

    public NotificationEntity() {
    }

    public NotificationEntity(Long id, UserEntity userActionEntity, UserEntity userNotifiedEntity,
            LikeEntity likeEntity, FollowEntity followEntity, TagEntity tagEntity, CommentEntity commentEntity,
            LocalDateTime createdAt) {
        this.id = id;
        this.userActionEntity = userActionEntity;
        this.userNotifiedEntity = userNotifiedEntity;
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

    public UserEntity getUserNotifiedEntity() {
        return userNotifiedEntity;
    }

    public void setUserNotifiedEntity(UserEntity userNotifiedEntity) {
        this.userNotifiedEntity = userNotifiedEntity;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "NotificationEntity [id=" + id + ", userActionEntity=" + userActionEntity + ", userNotifiedEntity="
                + userNotifiedEntity + ", likeEntity=" + likeEntity + ", followEntity=" + followEntity + ", tagEntity="
                + tagEntity + ", commentEntity=" + commentEntity + ", createdAt=" + createdAt + "]";
    }

}
