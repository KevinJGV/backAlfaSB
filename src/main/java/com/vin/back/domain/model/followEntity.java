package com.vin.back.domain.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "follows")
public class followEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "iduserfollowed")
    private userEntity userFollowedEntity;

    @ManyToOne
    @JoinColumn(name = "iduserfollower")
    private userEntity userFollowerEntity;

    private LocalDate followdate;

    public followEntity() {
    }

    public followEntity(Long id, userEntity userFollowedEntity, userEntity userFollowerEntity, LocalDate followDate) {
        this.id = id;
        this.userFollowedEntity = userFollowedEntity;
        this.userFollowerEntity = userFollowerEntity;
        this.followdate = followDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public userEntity getUserFollowedEntity() {
        return userFollowedEntity;
    }

    public void setUserFollowedEntity(userEntity userFollowedEntity) {
        this.userFollowedEntity = userFollowedEntity;
    }

    public userEntity getUserFollowerEntity() {
        return userFollowerEntity;
    }

    public void setUserFollowerEntity(userEntity userFollowerEntity) {
        this.userFollowerEntity = userFollowerEntity;
    }

    public LocalDate getFollowdate() {
        return followdate;
    }

    public void setFollowdate(LocalDate followDate) {
        this.followdate = followDate;
    }

    @Override
    public String toString() {
        return "followEntity [id=" + id + ", userFollowedEntity=" + userFollowedEntity + ", userFollowerEntity="
                + userFollowerEntity + ", followDate=" + followdate + "]";
    }
    
}
