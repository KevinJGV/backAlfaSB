package com.vin.back.infrastructure.security;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.vin.back.application.port.out.authPort.tokenGenerator;
import com.vin.back.domain.model.userEntity;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class TokenerComponent implements tokenGenerator{

    @Value("${security.jwt.secret}")
    private String jwtSecret;

    @Value("${security.jwt.expiration}")
    private Long jwtExpiration;

    @SuppressWarnings("deprecation")
    @Override
    public String generate(userEntity usuario) {
        return Jwts.builder()
        .subject(usuario.getUserName())
        .issuedAt(new Date())
        .expiration(new Date(System.currentTimeMillis() + jwtExpiration))
        .signWith(Keys.hmacShaKeyFor(jwtSecret.getBytes(StandardCharsets.UTF_8)),  SignatureAlgorithm.forName("HS512"))
        .compact();
    }

}
