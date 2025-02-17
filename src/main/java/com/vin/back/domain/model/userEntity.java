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

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LikeEntity> likeEntities = new ArrayList<>();

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CommentEntity> commentEntities = new ArrayList<>();

    @OneToMany(mappedBy = "userFollowedEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FollowEntity> followingEntities = new ArrayList<>();

    @OneToMany(mappedBy = "userFollowerEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FollowEntity> followerEntities = new ArrayList<>();

    @OneToMany(mappedBy = "userActionEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<NotificationEntity> notificationEntities = new ArrayList<>();

    public UserEntity() {
    }

    public UserEntity(Long id, String userName, String email, String fullName, LocalDate birthDate, Long phone,
            String password, String profilePhotoURI, String biography, List<LikeEntity> likesEntities,
            List<CommentEntity> commentsEntities, List<FollowEntity> followingEntities,
            List<FollowEntity> followerEntities, List<NotificationEntity> notificationEntities) {
        this.id = id;
        this.username = userName;
        this.email = email;
        this.fullname = fullName;
        this.birthdate = birthDate;
        this.phone = phone;
        this.password = password;
        this.profilephotouri = profilePhotoURI;
        this.biography = biography;
        this.likeEntities = likesEntities;
        this.commentEntities = commentsEntities;
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

    public void setUsername(String userName) {
        this.username = userName;
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

    public void setFullname(String fullName) {
        this.fullname = fullName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthDate) {
        this.birthdate = birthDate;
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

    public void setProfilephotouri(String profilePhotoURI) {
        this.profilephotouri = profilePhotoURI;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public List<LikeEntity> getLikeEntities() {
        return likeEntities;
    }

    public void setLikeEntities(List<LikeEntity> likesEntities) {
        this.likeEntities = likesEntities;
    }

    public List<CommentEntity> getCommentEntities() {
        return commentEntities;
    }

    public void setCommentEntities(List<CommentEntity> commentsEntities) {
        this.commentEntities = commentsEntities;
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
        return "userEntity [id=" + id + ", userName=" + username + ", email=" + email + ", fullName=" + fullname
                + ", birthDate=" + birthdate + ", phone=" + phone + ", password=" + password + ", profilePhotoURI="
                + profilephotouri + ", biography=" + biography + ", likesEntities=" + likeEntities
                + ", commentsEntities=" + commentEntities + ", followingEntities=" + followingEntities
                + ", followerEntities=" + followerEntities + ", notificationEntities=" + notificationEntities + "]";
    }

    
}
