package com.vin.back.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tags")
public class TagEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "idusertagged")
    private UserEntity userTaggedEntity;

    @ManyToOne
    @JoinColumn(name = "idusertagger")
    private UserEntity userTaggerEntity;

    @ManyToOne
    @JoinColumn(name = "idcomment")
    private CommentEntity commentEntity;

    public TagEntity() {
    }

    public TagEntity(Long id, UserEntity userTaggedEntity, UserEntity userTaggerEntity,
            com.vin.back.domain.model.CommentEntity commentEntity) {
        this.id = id;
        this.userTaggedEntity = userTaggedEntity;
        this.userTaggerEntity = userTaggerEntity;
        this.commentEntity = commentEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getUserTaggedEntity() {
        return userTaggedEntity;
    }

    public void setUserTaggedEntity(UserEntity userTaggedEntity) {
        this.userTaggedEntity = userTaggedEntity;
    }

    public UserEntity getUserTaggerEntity() {
        return userTaggerEntity;
    }

    public void setUserTaggerEntity(UserEntity userTaggerEntity) {
        this.userTaggerEntity = userTaggerEntity;
    }

    public CommentEntity getCommentEntity() {
        return commentEntity;
    }

    public void setCommentEntity(CommentEntity commentEntity) {
        this.commentEntity = commentEntity;
    }

    @Override
    public String toString() {
        return "tagEntity [id=" + id + ", userTaggedEntity=" + userTaggedEntity + ", userTaggerEntity="
                + userTaggerEntity + ", commentEntity=" + commentEntity + "]";
    }


}
