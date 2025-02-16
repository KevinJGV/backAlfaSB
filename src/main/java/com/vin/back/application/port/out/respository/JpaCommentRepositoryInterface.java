package com.vin.back.application.port.out.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vin.back.domain.model.commentEntity;

public interface JpaCommentRepositoryInterface extends JpaRepository<commentEntity,Long>{

}
