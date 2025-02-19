package com.vin.back.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vin.back.application.port.in.LikeCaseUse;
import com.vin.back.application.port.out.LikePort;
import com.vin.back.application.port.out.PostPort;
import com.vin.back.application.port.out.UserPort;
import com.vin.back.domain.model.PostEntity;
import com.vin.back.domain.model.UserEntity;

@Service
public class LikeService implements LikeCaseUse{

    @Autowired
    private LikePort likePort;

    @Autowired
    private PostPort postPort;

    @Autowired
    private UserPort userPort;

    @Override
    public boolean hasUserLiked(Long postId, String username) {
        PostEntity post = postPort.findById(postId);
        UserEntity user = userPort.getByUsername(username);
        return likePort.existsByPostEntityAndUserEntity(post, user);
    }


}
