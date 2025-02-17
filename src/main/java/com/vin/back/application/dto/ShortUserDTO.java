package com.vin.back.application.dto;

import com.vin.back.domain.model.UserEntity;

public class ShortUserDTO {
    private Long id;
    private String username;
    private String fullname;
    private String profilephotouri;

    public ShortUserDTO() {
    }

    public ShortUserDTO(UserEntity userEntity) {
        this.id = userEntity.getId();
        this.username = userEntity.getUsername();
        this.fullname = userEntity.getFullname();
        this.profilephotouri = userEntity.getProfilephotouri();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getProfilephotouri() {
        return profilephotouri;
    }

    public void setProfilephotouri(String profilephotouri) {
        this.profilephotouri = profilephotouri;
    }

    @Override
    public String toString() {
        return "ShortUserDTO [id=" + id + ", username=" + username + ", fullname=" + fullname + ", profilephotouri="
                + profilephotouri + "]";
    }

}
