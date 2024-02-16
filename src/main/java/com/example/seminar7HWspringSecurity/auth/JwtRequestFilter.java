package com.example.seminar7HWspringSecurity.auth;

import com.example.seminar7HWspringSecurity.service.JwtTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {
    private final JwtTokenService jwtTokenService;

    @Autowired
    public JwtRequestFilter(JwtTokenService jwtTokenService){
        this.jwtTokenService = jwtTokenService;
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

    }
}
