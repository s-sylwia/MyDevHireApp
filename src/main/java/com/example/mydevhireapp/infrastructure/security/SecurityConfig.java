package com.example.mydevhireapp.infrastructure.security;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/h2-console/**").permitAll() //  dostęp do konsoli H2
                .anyRequest().authenticated(); // wymog uwierzytelnienia dla innych żądań
        http.csrf().disable(); // Wyłącza CSRF, bo jest zalecane dla konsoli H2 w trybie dev
        http.headers().frameOptions().disable(); // Wyłącza zabezpieczenia dla iframe (wymagane dla konsoli H2)
    }
}

