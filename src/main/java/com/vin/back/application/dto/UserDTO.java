package com.vin.back.application.dto;

import java.time.LocalDate;
import java.util.List;

import com.vin.back.domain.model.UserEntity;

public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private String fullname;
    private LocalDate birthdate;
    private Long phone;
    private String profilephotouri;
    private String biography;
    private List<ShortUserDTO> followers;
    private List<ShortUserDTO> followed;

    public UserDTO() {
    }

    public UserDTO(UserEntity user, List<ShortUserDTO> followers, List<ShortUserDTO> followed) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.fullname = user.getFullname();
        this.profilephotouri = user.getProfilephotouri();
        this.biography = user.getBiography();
        this.followers = followers;
        this.followed = followed;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getProfilephotouri() {
        return profilephotouri;
    }

    public void setProfilephotouri(String profilephotouri) {
        this.profilephotouri = profilephotouri;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public List<ShortUserDTO> getFollowers() {
        return followers;
    }

    public void setFollowers(List<ShortUserDTO> followers) {
        this.followers = followers;
    }

    public List<ShortUserDTO> getFollowed() {
        return followed;
    }

    public void setFollowed(List<ShortUserDTO> followed) {
        this.followed = followed;
    }

    @Override
    public String toString() {
        return "UserDTO [id=" + id + ", username=" + username + ", email=" + email + ", fullname=" + fullname
                + ", birthdate=" + birthdate + ", phone=" + phone + ", profilephotouri=" + profilephotouri
                + ", biography=" + biography + ", followers=" + followers + ", followed=" + followed + "]";
    }
}
