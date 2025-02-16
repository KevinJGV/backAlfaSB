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
public class likeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "iduser")
    private userEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "idpost")
    private postEntity postEntity;

    public likeEntity() {
    }

    public likeEntity(Long id, com.vin.back.domain.model.userEntity userEntity, postEntity postsEntity) {
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

    public userEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(userEntity userEntity) {
        this.userEntity = userEntity;
    }

    public postEntity getPostEntity() {
        return postEntity;
    }

    public void setPostEntity(postEntity postsEntity) {
        this.postEntity = postsEntity;
    }

    @Override
    public String toString() {
        return "likeEntity [id=" + id + ", userEntity=" + userEntity + ", postsEntity=" + postEntity + "]";
    }

}
