package com.vin.back.domain.model;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "comments")
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "iduser")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "idpost")
    private PostEntity postEntity;

    @OneToMany(mappedBy = "commentEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TagEntity> tagEntities = new ArrayList<>();

    @Column(length = 200)
    private String content;

    public CommentEntity() {
    }

    public CommentEntity(Long id, com.vin.back.domain.model.UserEntity userEntity,
            com.vin.back.domain.model.PostEntity postEntity, List<TagEntity> tagEntities, String content) {
        this.id = id;
        this.userEntity = userEntity;
        this.postEntity = postEntity;
        this.tagEntities = tagEntities;
        this.content = content;
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

    public void setPostEntity(PostEntity postEntity) {
        this.postEntity = postEntity;
    }

    public List<TagEntity> getTagEntities() {
        return tagEntities;
    }

    public void setTagEntities(List<TagEntity> tagEntities) {
        this.tagEntities = tagEntities;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "commentEntity [id=" + id + ", userEntity=" + userEntity + ", postEntity=" + postEntity
                + ", tagEntities=" + tagEntities + ", content=" + content + "]";
    }


}
