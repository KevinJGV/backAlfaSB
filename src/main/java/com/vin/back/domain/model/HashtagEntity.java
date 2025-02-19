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
public class HashtagEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true, length = 30, nullable = false)
    private String name;

    @OneToMany(mappedBy = "hashtagEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PostHashtagEntity> postHashtagEntities = new ArrayList<>();

    public HashtagEntity() {
    }

    public HashtagEntity(Long id, String name, List<PostHashtagEntity> postHashtagEntities) {
        this.id = id;
        this.name = name;
        this.postHashtagEntities = postHashtagEntities;
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

    public List<PostHashtagEntity> getPostHashtagEntities() {
        return postHashtagEntities;
    }

    public void setPostHashtagEntities(List<PostHashtagEntity> postHashtagEntities) {
        this.postHashtagEntities = postHashtagEntities;
    }

    @Override
    public String toString() {
        return "hashtagEntity [id=" + id + ", name=" + name + ", postHashtagEntities=" + postHashtagEntities + "]";
    }    
}
