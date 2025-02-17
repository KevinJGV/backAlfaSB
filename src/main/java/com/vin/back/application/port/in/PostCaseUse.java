package com.vin.back.application.port.in;

import java.util.List;

import com.vin.back.application.dto.CommentDTO;
import com.vin.back.application.dto.LikeDTO;
import com.vin.back.application.dto.PostDTO;
import com.vin.back.domain.model.CommentEntity;
import com.vin.back.domain.model.PostEntity;

public interface PostCaseUse {
    List<PostDTO> getPosts();
    List<PostDTO> getPostsByUser(String username);
    PostEntity setPost(PostDTO post);
    boolean deletePost(Long id);
    boolean toggleLike(LikeDTO likeDTO);
    CommentEntity setComment(CommentDTO commentDTO);
}
