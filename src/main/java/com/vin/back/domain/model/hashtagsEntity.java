package com.vin.back.domain.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "hashtags")
public class hashtagsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 30)
    private String name;

    @OneToMany(mappedBy = "hashtagsEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<postsHashtagsEntity> postsHashtagsEntities = new ArrayList<>();

    public hashtagsEntity() {
    }

    public hashtagsEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<postsHashtagsEntity> getPostsHashtagsEntities() {
        return postsHashtagsEntities;
    }

    public void setPostsHashtagsEntities(List<postsHashtagsEntity> postsHashtagsEntities) {
        this.postsHashtagsEntities = postsHashtagsEntities;
    }

    @Override
    public String toString() {
        return "hashtagsEntity [id=" + id + ", name=" + name + ", postsHashtagsEntities=" + postsHashtagsEntities + "]";
    }

    
}
