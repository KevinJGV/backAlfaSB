package com.vin.back.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "posts_hashtags")
public class postHashtagEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idpost")
    private postEntity postEntity;

    @ManyToOne
    @JoinColumn(name = "idhashtag")
    private hashtagEntity hashtagEntity;

    public postHashtagEntity() {
    }

    public postHashtagEntity(Long id, postEntity postsEntity, hashtagEntity hashtagsEntity) {
        this.id = id;
        this.postEntity = postsEntity;
        this.hashtagEntity = hashtagsEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public postEntity getPostEntity() {
        return postEntity;
    }

    public void setPostEntity(postEntity postsEntity) {
        this.postEntity = postsEntity;
    }

    public hashtagEntity getHashtagEntity() {
        return hashtagEntity;
    }

    public void setHashtagEntity(hashtagEntity hashtagsEntity) {
        this.hashtagEntity = hashtagsEntity;
    }

    @Override
    public String toString() {
        return "postHashtagEntity [id=" + id + ", postsEntity=" + postEntity + ", hashtagsEntity=" + hashtagEntity
                + "]";
    }

}
