package com.vin.back.application.dto;

import java.time.LocalDateTime;

public class NotificationDTO {
    private Long id;

    private ShortUserDTO userAction;

    private ShortUserDTO userNotified;

    private LikeDTO like;

    private FollowDTO follow;

    private TagDTO tag;

    private CommentDTO comment;

    private LocalDateTime createdAt;

    public NotificationDTO() {
    }

    public NotificationDTO(Long id, ShortUserDTO userAction, ShortUserDTO userNotificated, LikeDTO like,
            FollowDTO follow,
            TagDTO tag, CommentDTO comment, LocalDateTime createdAt) {
        this.id = id;
        this.userAction = userAction;
        this.userNotified = userNotificated;
        this.like = like;
        this.follow = follow;
        this.tag = tag;
        this.comment = comment;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShortUserDTO getUserAction() {
        return userAction;
    }

    public void setUserAction(ShortUserDTO userAction) {
        this.userAction = userAction;
    }

    public ShortUserDTO getUserNotified() {
        return userNotified;
    }

    public void setUserNotified(ShortUserDTO userNotificated) {
        this.userNotified = userNotificated;
    }

    public LikeDTO getLike() {
        return like;
    }

    public void setLike(LikeDTO like) {
        this.like = like;
    }

    public FollowDTO getFollow() {
        return follow;
    }

    public void setFollow(FollowDTO follow) {
        this.follow = follow;
    }

    public TagDTO getTag() {
        return tag;
    }

    public void setTag(TagDTO tag) {
        this.tag = tag;
    }

    public CommentDTO getComment() {
        return comment;
    }

    public void setComment(CommentDTO comment) {
        this.comment = comment;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "NotificationDTO [id=" + id + ", userAction=" + userAction + ", userNotificated=" + userNotified
                + ", like=" + like + ", follow=" + follow + ", tag=" + tag + ", comment=" + comment + ", createdAt="
                + createdAt + "]";
    }
}
