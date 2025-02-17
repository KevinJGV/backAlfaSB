package com.vin.back.application.port.in;

import java.util.List;

import com.vin.back.application.dto.PostDTO;
import com.vin.back.domain.model.postEntity;

public interface PostCaseUse {
    List<PostDTO> getPosts();
    List<PostDTO> getPostsByUser(String username);
    postEntity savePost(postEntity postEntity);
    boolean deletePost(Long id);
}
