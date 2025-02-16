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
public class tagEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "idusertagged")
    private userEntity userTaggedEntity;

    @ManyToOne
    @JoinColumn(name = "idusertagger")
    private userEntity userTaggerEntity;

    @ManyToOne
    @JoinColumn(name = "idcomment")
    private commentEntity commentEntity;

    public tagEntity() {
    }

    public tagEntity(Long id, userEntity userTaggedEntity, userEntity userTaggerEntity,
            com.vin.back.domain.model.commentEntity commentEntity) {
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

    public userEntity getUserTaggedEntity() {
        return userTaggedEntity;
    }

    public void setUserTaggedEntity(userEntity userTaggedEntity) {
        this.userTaggedEntity = userTaggedEntity;
    }

    public userEntity getUserTaggerEntity() {
        return userTaggerEntity;
    }

    public void setUserTaggerEntity(userEntity userTaggerEntity) {
        this.userTaggerEntity = userTaggerEntity;
    }

    public commentEntity getCommentEntity() {
        return commentEntity;
    }

    public void setCommentEntity(commentEntity commentEntity) {
        this.commentEntity = commentEntity;
    }

    @Override
    public String toString() {
        return "tagEntity [id=" + id + ", userTaggedEntity=" + userTaggedEntity + ", userTaggerEntity="
                + userTaggerEntity + ", commentEntity=" + commentEntity + "]";
    }


}
