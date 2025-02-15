package com.vin.back.domain.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.Nullable;
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
public class userEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 70)
    private String userName;

    @Column(unique = true)
    private String email;

    @Column(length = 70)
    private String fullName;
    
    private LocalDate birthDate;

    @Column(length = 70)
    private Long phone;

    @Column(length = 170)
    private String password;

    @Nullable
    @Column(columnDefinition = "TEXT")
    private String profilePhotoURI;

    @Nullable
    private String biography;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<likesEntity> likesEntities = new ArrayList<>();

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<commentsEntity> commentsEntities = new ArrayList<>();
}
