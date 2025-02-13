package com.vin.back.infrastructure.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vin.back.application.service.authCaseUse;
import com.vin.back.domain.model.userEntity;


@RestController
@RequestMapping("/api")
public class AuthController {
    @Autowired
    private authCaseUse authCaseUse;

    @PostMapping("/auth")
    public ResponseEntity<String> postMethodName(@ModelAttribute userEntity formInput) {
        String token = authCaseUse.init(formInput.getUserName(), formInput.getPassword());
        return ResponseEntity.ok(token);
    }
    
}
