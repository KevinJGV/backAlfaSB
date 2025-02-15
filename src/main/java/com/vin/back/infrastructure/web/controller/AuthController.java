package com.vin.back.infrastructure.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vin.back.application.service.authService;
import com.vin.back.domain.model.userEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class AuthController {
    @Autowired
    private authService authService;

    @PostMapping("/auth")
    public ResponseEntity<String> auth(@ModelAttribute userEntity formData) {
        String token = authService.login(formData.getUserName(), formData.getPassword());
        return ResponseEntity.ok(token);
    }

    @GetMapping("/authTest")
    public String getMethodName() {
        return "OK!";
    }
    
}
