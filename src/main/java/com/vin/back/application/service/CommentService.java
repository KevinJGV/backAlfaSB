package com.vin.back.application.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.vin.back.application.port.in.CommentCaseUse;
import com.vin.back.application.port.out.CommentPort;
import com.vin.back.application.port.out.PostPort;
import com.vin.back.application.port.out.UserPort;
import com.vin.back.domain.model.PostEntity;
import com.vin.back.domain.model.UserEntity;

public class CommentService implements CommentCaseUse{

    @Autowired
    private CommentPort commentPort;

    @Autowired
    private UserPort userPort;

    @AutoWired
    private PostPort postPort;

    @Override
    public boolean hasUserCommented(Long postId, String username) {
        PostEntity post = postPort.findById(postId);
        UserEntity user = userPort.getByUsername(username);
        return commentPort.existsByPostEntityAndUserEntity(post, user);
    }

}
