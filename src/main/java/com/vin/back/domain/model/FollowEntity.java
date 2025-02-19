package com.vin.back.domain.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "follows")
public class FollowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "iduserfollowed", nullable = false)
    private UserEntity userFollowedEntity;

    @ManyToOne
    @JoinColumn(name = "iduserfollower", nullable = false)
    private UserEntity userFollowerEntity;

    @Column(nullable = false)
    private LocalDate followdate;

    public FollowEntity() {
    }

    public FollowEntity(Long id, UserEntity userFollowedEntity, UserEntity userFollowerEntity, LocalDate followDate) {
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

    public UserEntity getUserFollowedEntity() {
        return userFollowedEntity;
    }

    public void setUserFollowedEntity(UserEntity userFollowedEntity) {
        this.userFollowedEntity = userFollowedEntity;
    }

    public UserEntity getUserFollowerEntity() {
        return userFollowerEntity;
    }

    public void setUserFollowerEntity(UserEntity userFollowerEntity) {
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
