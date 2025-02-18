package com.vin.back.infrastructure.persistence.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vin.back.application.port.out.CommentPort;
import com.vin.back.application.port.out.respository.JpaCommentRepositoryInterface;
import com.vin.back.domain.model.CommentEntity;
import com.vin.back.domain.model.PostEntity;
import com.vin.back.domain.model.UserEntity;

@Repository
public class CommentRepository implements CommentPort {
    @Autowired
    private JpaCommentRepositoryInterface repository;

    @Override
    public List<CommentEntity> getByPostEntity(PostEntity post) {
        return repository.findByPostEntity(post);
    }

    @Override
    public CommentEntity save(CommentEntity entity) {
        return repository.save(entity);
    }

    @Override
    public boolean existsByPostEntityAndUserEntity(PostEntity post, UserEntity user) {
        return repository.existsByPostEntityAndUserEntity(post, user);
    }
}
