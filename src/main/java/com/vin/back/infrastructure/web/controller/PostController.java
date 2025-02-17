package com.vin.back.infrastructure.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vin.back.application.dto.PostDTO;
import com.vin.back.application.service.PostService;
import com.vin.back.domain.model.postEntity;

import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public ResponseEntity<List<PostDTO>> getPosts() {
        return ResponseEntity.ok(postService.getPosts());
    }

    @GetMapping("/{username}")
    public ResponseEntity<List<PostDTO>> getPosts(@PathVariable String username) {
        return ResponseEntity.ok(postService.getPostsByUser(username));
    }

    @PutMapping
    public ResponseEntity<postEntity> updatePost(@ModelAttribute postEntity postEntity) {
        return ResponseEntity.ok(postService.savePost(postEntity));
    }
    
    @PostMapping
    public ResponseEntity<postEntity> setPost(@ModelAttribute postEntity postEntity) {
        return ResponseEntity.ok(postService.savePost(postEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deletePost(@PathVariable Long id) {
        return ResponseEntity.ok(postService.deletePost(id));
    }
}
