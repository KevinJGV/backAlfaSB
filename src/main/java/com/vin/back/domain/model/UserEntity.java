package com.vin.back.domain.model;

import java.time.LocalDate;
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
@Table(name="users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 70)
    private String username;

    @Column(unique = true)
    private String email;

    @Column(length = 70)
    private String fullname;
    
    private LocalDate birthdate;

    @Column(length = 70)
    private Long phone;

    @Column(length = 170)
    private String password;

    @Column(columnDefinition = "TEXT", nullable = true)
    private String profilephotouri;

    @Column(nullable = true)
    private String biography;

    @OneToMany(mappedBy = "userFollowedEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FollowEntity> followingEntities = new ArrayList<>();

    @OneToMany(mappedBy = "userFollowerEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FollowEntity> followerEntities = new ArrayList<>();

    @OneToMany(mappedBy = "userActionEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<NotificationEntity> notificationEntities = new ArrayList<>();

    public UserEntity() {
    }

    public UserEntity(Long id, String username, String email, String fullname, LocalDate birthdate, Long phone,
            String password, String profilephotouri, String biography, List<FollowEntity> followingEntities,
            List<FollowEntity> followerEntities, List<NotificationEntity> notificationEntities) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.fullname = fullname;
        this.birthdate = birthdate;
        this.phone = phone;
        this.password = password;
        this.profilephotouri = profilephotouri;
        this.biography = biography;
        this.followingEntities = followingEntities;
        this.followerEntities = followerEntities;
        this.notificationEntities = notificationEntities;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<FollowEntity> getFollowingEntities() {
        return followingEntities;
    }

    public void setFollowingEntities(List<FollowEntity> followingEntities) {
        this.followingEntities = followingEntities;
    }

    public List<FollowEntity> getFollowerEntities() {
        return followerEntities;
    }

    public void setFollowerEntities(List<FollowEntity> followerEntities) {
        this.followerEntities = followerEntities;
    }

    public List<NotificationEntity> getNotificationEntities() {
        return notificationEntities;
    }

    public void setNotificationEntities(List<NotificationEntity> notificationEntities) {
        this.notificationEntities = notificationEntities;
    }

    @Override
    public String toString() {
        return "UserEntity [id=" + id + ", username=" + username + ", email=" + email + ", fullname=" + fullname
                + ", birthdate=" + birthdate + ", phone=" + phone + ", password=" + password + ", profilephotouri="
                + profilephotouri + ", biography=" + biography + ", followingEntities=" + followingEntities
                + ", followerEntities=" + followerEntities + ", notificationEntities=" + notificationEntities + "]";
    }

}
