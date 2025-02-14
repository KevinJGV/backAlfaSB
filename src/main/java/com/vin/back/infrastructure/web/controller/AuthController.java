package com.vin.back.infrastructure.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vin.back.application.service.authService;
import com.vin.back.domain.model.userEntity;

@RestController
@RequestMapping("/api")
public class AuthController {
    @Autowired
    private authService authCaseUse;

    @PostMapping("/auth")
    public ResponseEntity<String> auth(@ModelAttribute userEntity formData) {
        String token = authCaseUse.login(formData.getUsername(), formData.getPassword());
        return ResponseEntity.ok(token);
    }    
}
