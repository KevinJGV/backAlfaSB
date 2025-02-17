package com.vin.back.application.dto;

import java.time.LocalDate;

import com.vin.back.domain.model.FollowEntity;

public class FollowDTO {
    private Long id;
    private Long rawUserFollowerId;
    private Long rawUserFollowedId;

    private ShortUserDTO userFollowed;

    private ShortUserDTO userFollower;

    private LocalDate followdate;

    public FollowDTO() {
    }

    public FollowDTO(FollowEntity followEntity, ShortUserDTO userFollowed, ShortUserDTO userFollower) {
        this.id = followEntity.getId();
        this.userFollowed = userFollowed;
        this.userFollower = userFollower;
        this.followdate = followEntity.getFollowdate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRawUserFollowerId() {
        return rawUserFollowerId;
    }

    public void setRawUserFollowerId(Long rawUserFollowerId) {
        this.rawUserFollowerId = rawUserFollowerId;
    }

    public Long getRawUserFollowedId() {
        return rawUserFollowedId;
    }

    public void setRawUserFollowedId(Long rawUserFollowedId) {
        this.rawUserFollowedId = rawUserFollowedId;
    }

    public ShortUserDTO getUserFollowed() {
        return userFollowed;
    }

    public void setUserFollowed(ShortUserDTO userFollowed) {
        this.userFollowed = userFollowed;
    }

    public ShortUserDTO getUserFollower() {
        return userFollower;
    }

    public void setUserFollower(ShortUserDTO userFollower) {
        this.userFollower = userFollower;
    }

    public LocalDate getFollowdate() {
        return followdate;
    }

    public void setFollowdate(LocalDate followdate) {
        this.followdate = followdate;
    }

    @Override
    public String toString() {
        return "FollowDTO [id=" + id + ", rawUserFollowerId=" + rawUserFollowerId + ", rawUserFollowedId="
                + rawUserFollowedId + ", userFollowed=" + userFollowed + ", userFollower=" + userFollower
                + ", followdate=" + followdate + "]";
    }

}
