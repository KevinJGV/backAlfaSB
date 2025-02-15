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
public class postsHashtagsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idPost")
    private postsEntity postsEntity;

    @ManyToOne
    @JoinColumn(name = "idHashtag")
    private hashtagsEntity hashtagsEntity;

    public postsHashtagsEntity() {
    }

    public postsHashtagsEntity(Long id, postsEntity postsEntity, hashtagsEntity hashtagsEntity) {
        this.id = id;
        this.postsEntity = postsEntity;
        this.hashtagsEntity = hashtagsEntity;
    }

    public Long getId() {
        return id;
    }

    public postsEntity getPostsEntity() {
        return postsEntity;
    }

    public hashtagsEntity getHashtagsEntity() {
        return hashtagsEntity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPostsEntity(postsEntity postsEntity) {
        this.postsEntity = postsEntity;
    }

    public void setHashtagsEntity(hashtagsEntity hashtagsEntity) {
        this.hashtagsEntity = hashtagsEntity;
    }

    @Override
    public String toString() {
        return "postsHashtagsEntity{" + "id=" + id + ", postsEntity=" + postsEntity + ", hashtagsEntity=" + hashtagsEntity
                + '}';
    }
}
