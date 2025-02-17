package com.vin.back.application.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.vin.back.application.dto.CommentDTO;
import com.vin.back.application.dto.LikeDTO;
import com.vin.back.application.dto.PostDTO;
import com.vin.back.application.port.in.PostCaseUse;
import com.vin.back.application.port.out.CommentPort;
import com.vin.back.application.port.out.HashtagPort;
import com.vin.back.application.port.out.LikePort;
import com.vin.back.application.port.out.PostPort;
import com.vin.back.application.port.out.TagPort;
import com.vin.back.application.port.out.UserPort;
import com.vin.back.domain.mapper.PostMapper;
import com.vin.back.domain.model.CommentEntity;
import com.vin.back.domain.model.HashtagEntity;
import com.vin.back.domain.model.LikeEntity;
import com.vin.back.domain.model.PostEntity;
import com.vin.back.domain.model.PostHashtagEntity;
import com.vin.back.domain.model.TagEntity;
import com.vin.back.domain.model.UserEntity;

public class PostService implements PostCaseUse {

    @Autowired
    private UserPort userPort;

    @Autowired
    private PostPort postPort;

    @Autowired
    private HashtagPort hashtagPort;

    @Autowired
    private LikePort likePort;

    @Autowired
    private CommentPort commentPort;

    @Autowired
    private TagPort tagPort;

    @Override
    public List<PostDTO> getPosts() {
        return PostMapper.toDTO(postPort.findAll());
    }

    @Override
    public List<PostDTO> getPostsByUser(String username) {
        return PostMapper.toDTO(postPort.getByUser(userPort.getByUsername(username)));
    }

    @Override
    public PostEntity setPost(PostDTO post) {
        PostEntity finalPost = new PostEntity();
        finalPost.setContent(finalPost.getContent());
        finalPost.setUploadDate(LocalDate.now());

        List<HashtagEntity> hashtagEntities = post.getRawHashtags().stream().map(hashtag -> {
            return hashtagPort.getByName(hashtag).orElseGet(() -> {
                HashtagEntity finalHashtag = new HashtagEntity();
                finalHashtag.setName(hashtag);
                return hashtagPort.save(finalHashtag);
            });
        }).collect(Collectors.toList());

        List<PostHashtagEntity> relationEntities = hashtagEntities.stream().map(tag -> {
            PostHashtagEntity relation = new PostHashtagEntity();
            relation.setPostEntity(finalPost);
            relation.setHashtagEntity(tag);
            return relation;
        }).collect(Collectors.toList());

        finalPost.setPostHashtagEntities(relationEntities);
        return postPort.save(finalPost);
    }

    @Override
    public boolean deletePost(Long id) {
        return postPort.delete(postPort.findById(id));
    }

    @Override
    public boolean toggleLike(LikeDTO likeDTO) {
        PostEntity post = postPort.findById(likeDTO.getRawPostId());
        UserEntity user = userPort.findById(likeDTO.getRawUserId());

        Optional<LikeEntity> like = likePort.getByPostEntityAndUserEntity(post, user);

        if (like.isPresent()) {
            likePort.deleteByPostEntityAndUserEntity(post, user);
            return false;
        } else {
            LikeEntity newLike = new LikeEntity();
            newLike.setPostEntity(post);
            newLike.setUserEntity(user);
            likePort.save(newLike);
            return true;
        }
    }

    @Override
    public CommentEntity setComment(CommentDTO commentDTO) {
        PostEntity post = postPort.findById(commentDTO.getRawPostId());
        UserEntity user = userPort.findById(commentDTO.getRawUserId());

        CommentEntity newComment = new CommentEntity();
        newComment.setPostEntity(post);
        newComment.setUserEntity(user);

        List<TagEntity> tags = commentDTO.getTags().stream().map(tagDTO -> {
            Optional<UserEntity> mentionedUser = Optional.of(userPort.findById(tagDTO.getUserTagged().getId()));
            return mentionedUser.map(userEntity -> {
                TagEntity tag = new TagEntity();
                tag.setUserTaggerEntity(user);
                tag.setUserTaggedEntity(userEntity);
                tag.setCommentEntity(newComment);
                return tag;
            }).orElse(null);
        }).collect(Collectors.toList());

        newComment.setTagEntities(tags);

        CommentEntity savedComment = commentPort.save(newComment);

        tagPort.setAll(tags);

        return savedComment;
    }
}
