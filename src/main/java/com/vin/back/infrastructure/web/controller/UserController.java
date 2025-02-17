package com.vin.back.infrastructure.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vin.back.application.dto.ShortUserDTO;
import com.vin.back.application.dto.UserDTO;
import com.vin.back.application.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public ResponseEntity<UserDTO> getUserEntity(@PathVariable String username) {
        return ResponseEntity.ok(userService.getUserDTOByUsername(username));
    }
    
    @GetMapping("/{username}/followers")
    public ResponseEntity<List<ShortUserDTO>> getFollowers(@PathVariable String username) {
        return ResponseEntity.ok(userService.getFollowers(username));
    }

    @GetMapping("/{username}/followed")
    public ResponseEntity<List<ShortUserDTO>> getFollowed(@PathVariable String username) {
        return ResponseEntity.ok(userService.getFollowed(username));
    }
}
