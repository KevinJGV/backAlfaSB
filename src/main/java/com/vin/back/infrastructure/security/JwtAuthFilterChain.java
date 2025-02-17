package com.vin.back.infrastructure.security;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.vin.back.application.service.sessionServices.AuthService;
import com.vin.back.infrastructure.exception.TokenFilteringException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthFilterChain extends OncePerRequestFilter {
    @Autowired
    private TokenerComponent tokener;

    @Autowired
    private AuthService authService;

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response,
            @NonNull FilterChain filterChain)
            throws ServletException, IOException {
        try {
            String jwt = validateToken(request);

            if (jwt != null) {

                if (authService.isTokenInvalidated(jwt)) {
                    response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                    response.getWriter().write("Token inválido");
                    return;
                }

                if (tokener.validate(jwt)) {
                    String username = tokener.getUsernameToken(jwt);
                    UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(username, null,
                            new ArrayList<>());
                    auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    SecurityContextHolder.getContext().setAuthentication(auth);
                }
            }
        } catch (Exception e) {
            throw new TokenFilteringException("Error en el tratamiento del token: ", e);
        }

        filterChain.doFilter(request, response);
    }

    private String validateToken(HttpServletRequest request) {
        String bearerTkn = request.getHeader("Authorization");
        if (bearerTkn != null && bearerTkn.startsWith("Bearer ")) {
            System.out.println("Bearer: " + bearerTkn);
            return bearerTkn.substring(7);
        } else {
            System.out.println("Error Bearer: " + bearerTkn);
        }
        return null;
    }

}
