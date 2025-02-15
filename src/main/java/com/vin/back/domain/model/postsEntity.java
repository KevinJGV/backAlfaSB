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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "posts")
public class postsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private userEntity userEntity;

    @Column(columnDefinition = "TEXT", length = 500)
    private String content;

    @Nullable
    @Column(columnDefinition = "TEXT")
    private String imageAttached;

    private LocalDate uploadDate;

    @OneToMany(mappedBy = "postsEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<postsHashtagsEntity> postsHashtagsEntities = new ArrayList<>();

    @OneToMany(mappedBy = "postsEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<likesEntity> likesEntities = new ArrayList<>();

    @OneToMany(mappedBy = "postsEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<commentsEntity> commentsEntities = new ArrayList<>();

}
