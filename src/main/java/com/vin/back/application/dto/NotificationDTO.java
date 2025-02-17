package com.vin.back.application.dto;

import java.time.LocalTime;

public class NotificationDTO {
    private Long id;

    private UserDTO userAction;

    private UserDTO userNotificated;

    private LikeDTO like;

    private FollowDTO follow;

    private TagDTO tag;

    private CommentDTO comment;

    private LocalTime createdAt;

    public NotificationDTO() {
    }

    public NotificationDTO(Long id, UserDTO userAction, UserDTO userNotificated, LikeDTO like, FollowDTO follow,
            TagDTO tag, CommentDTO comment, LocalTime createdAt) {
        this.id = id;
        this.userAction = userAction;
        this.userNotificated = userNotificated;
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

    public UserDTO getUserAction() {
        return userAction;
    }

    public void setUserAction(UserDTO userAction) {
        this.userAction = userAction;
    }

    public UserDTO getUserNotificated() {
        return userNotificated;
    }

    public void setUserNotificated(UserDTO userNotificated) {
        this.userNotificated = userNotificated;
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

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "NotificationDTO [id=" + id + ", userAction=" + userAction + ", userNotificated=" + userNotificated
                + ", like=" + like + ", follow=" + follow + ", tag=" + tag + ", comment=" + comment + ", createdAt="
                + createdAt + "]";
    }
}
