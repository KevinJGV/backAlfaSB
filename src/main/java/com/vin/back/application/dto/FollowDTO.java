package com.vin.back.application.dto;

import java.time.LocalDate;

public class FollowDTO {
    private Long id;

    private UserDTO userFollowed;

    private UserDTO userFollower;

    private LocalDate followdate;

    public FollowDTO() {
    }

    public FollowDTO(Long id, UserDTO userFollowed, UserDTO userFollower, LocalDate followdate) {
        this.id = id;
        this.userFollowed = userFollowed;
        this.userFollower = userFollower;
        this.followdate = followdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDTO getUserFollowed() {
        return userFollowed;
    }

    public void setUserFollowed(UserDTO userFollowed) {
        this.userFollowed = userFollowed;
    }

    public UserDTO getUserFollower() {
        return userFollower;
    }

    public void setUserFollower(UserDTO userFollower) {
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
        return "FollowDTO [id=" + id + ", userFollowed=" + userFollowed + ", userFollower=" + userFollower
                + ", followdate=" + followdate + "]";
    }

}
