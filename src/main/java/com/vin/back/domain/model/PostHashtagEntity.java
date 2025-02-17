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
public class PostHashtagEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idpost")
    private PostEntity postEntity;

    @ManyToOne
    @JoinColumn(name = "idhashtag")
    private HashtagEntity hashtagEntity;

    public PostHashtagEntity() {
    }

    public PostHashtagEntity(Long id, PostEntity postsEntity, HashtagEntity hashtagsEntity) {
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

    public PostEntity getPostEntity() {
        return postEntity;
    }

    public void setPostEntity(PostEntity postsEntity) {
        this.postEntity = postsEntity;
    }

    public HashtagEntity getHashtagEntity() {
        return hashtagEntity;
    }

    public void setHashtagEntity(HashtagEntity hashtagsEntity) {
        this.hashtagEntity = hashtagsEntity;
    }

    @Override
    public String toString() {
        return "postHashtagEntity [id=" + id + ", postsEntity=" + postEntity + ", hashtagsEntity=" + hashtagEntity
                + "]";
    }

}
