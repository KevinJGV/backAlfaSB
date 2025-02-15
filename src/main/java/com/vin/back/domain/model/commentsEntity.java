package com.vin.back.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "comments")
public class commentsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private userEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "id")
    private postsEntity postsEntity;

    @Column(length = 200)
    private String content;

    public commentsEntity() {
    }

    public commentsEntity(Long id, com.vin.back.domain.model.userEntity userEntity,
            com.vin.back.domain.model.postsEntity postsEntity, String content) {
        this.id = id;
        this.userEntity = userEntity;
        this.postsEntity = postsEntity;
        this.content = content;
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

    public postsEntity getPostsEntity() {
        return postsEntity;
    }

    public void setPostsEntity(postsEntity postsEntity) {
        this.postsEntity = postsEntity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "commentsEntity [id=" + id + ", userEntity=" + userEntity + ", postsEntity=" + postsEntity + ", content="
                + content + "]";
    }
}
