package com.vin.back.infrastructure.web.controller.sessionControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vin.back.application.service.sessionServices.authService;
import com.vin.back.domain.model.userEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private authService authService;

    @PostMapping
    public ResponseEntity<String> auth(@ModelAttribute userEntity formData) {
        String token = authService.login(formData.getUsername(), formData.getPassword());
        return ResponseEntity.ok(token);
    }

    @GetMapping("/authTest")
    public String getMethodName() {
        return "OK!";
    }
    
}
