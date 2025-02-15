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
public class likesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private userEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "idPost")
    private postsEntity postsEntity;

    public likesEntity() {
    }

    public likesEntity(Long id, com.vin.back.domain.model.userEntity userEntity,
            com.vin.back.domain.model.postsEntity postsEntity) {
        this.id = id;
        this.userEntity = userEntity;
        this.postsEntity = postsEntity;
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

    @Override
    public String toString() {
        return "likesEntity [id=" + id + ", userEntity=" + userEntity + ", postsEntity=" + postsEntity + "]";
    }
}
