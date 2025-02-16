package com.vin.back.infrastructure.web.controller.sessionControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vin.back.application.service.sessionServices.signupService;
import com.vin.back.domain.model.userEntity;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api/signup")
public class signupController {

    @Autowired
    private signupService signupService;

    @PostMapping
    public ResponseEntity<Void> signup(@ModelAttribute userEntity formData) {
        try {
            boolean isSaved = signupService.signup(formData);
            if (isSaved) {
                return ResponseEntity.status(HttpStatus.CREATED).build();
            }
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

