package com.vin.back.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "likes")
public class LikeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "iduser")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "idpost")
    private PostEntity postEntity;

    public LikeEntity() {
    }

    public LikeEntity(Long id, com.vin.back.domain.model.UserEntity userEntity, PostEntity postsEntity) {
        this.id = id;
        this.userEntity = userEntity;
        this.postEntity = postsEntity;
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

    public PostEntity getPostEntity() {
        return postEntity;
    }

    public void setPostEntity(PostEntity postsEntity) {
        this.postEntity = postsEntity;
    }

    @Override
    public String toString() {
        return "likeEntity [id=" + id + ", userEntity=" + userEntity + ", postsEntity=" + postEntity + "]";
    }

}
