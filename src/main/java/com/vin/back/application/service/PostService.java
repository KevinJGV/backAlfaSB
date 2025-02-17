package com.vin.back.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vin.back.application.dto.PostDTO;
import com.vin.back.application.port.in.PostCaseUse;
import com.vin.back.application.port.out.PostPort;
import com.vin.back.domain.mapper.PostMapper;
import com.vin.back.domain.model.postEntity;

public class PostService implements PostCaseUse {

    @Autowired
    private UserService userService;

    @Autowired
    private PostPort postPort;

    @Override
    public List<PostDTO> getPosts() {
        return PostMapper.toDTO(postPort.findAll());
    }

    @Override
    public List<PostDTO> getPostsByUser(String username) {
        return PostMapper.toDTO(postPort.getByUser(userService.getUserEntityByUsername(username)));
    }

    @Override
    public postEntity savePost(postEntity postEntity) {
        return postPort.save(postEntity);
    }

    @Override
    public boolean deletePost(Long id) {
        return postPort.delete(postPort.findById(id));
    }
}
