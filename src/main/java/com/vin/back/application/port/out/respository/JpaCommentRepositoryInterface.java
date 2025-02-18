package com.vin.back.application.port.out.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vin.back.domain.model.CommentEntity;
import com.vin.back.domain.model.PostEntity;
import com.vin.back.domain.model.UserEntity;

public interface JpaCommentRepositoryInterface extends JpaRepository<CommentEntity,Long>{
    boolean existsByPostEntityAndUserEntity(PostEntity post, UserEntity user);
    List<CommentEntity> findByPostEntity(PostEntity post);
}
