package com.vin.back.infrastructure.web.controller.sessionControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vin.back.application.service.sessionServices.AuthService;
import com.vin.back.domain.model.UserEntity;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping
    public ResponseEntity<String> auth(@ModelAttribute UserEntity formData) {
        String token = authService.login(formData.getUsername(), formData.getPassword());
        return ResponseEntity.ok(token);
    }

    @GetMapping("/authTest")
    public String getMethodName() {
        return "OK!";
    }

    @CrossOrigin(origins = "http://localhost:5174")
    @PostMapping("/logout")
    public ResponseEntity<String> logout(HttpServletRequest request) {
        String token = request.getHeader("Authorization");

        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
            authService.logout(token);
            return ResponseEntity.ok("Sesión cerrada correctamente.");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Token inválido o inexistente.");
        }
    }
    
}
