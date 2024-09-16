package com.blog.project.demo.projectblog.config;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Component
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests()
                .requestMatchers("/", "/posts/create", "/users/register", "/css/**").permitAll() // Allow access to these paths
                .anyRequest().authenticated() // All other pages require login
                .and()
                .formLogin()
                .loginPage("/login") // Set custom login page
                .permitAll()
                .and()
                .logout()
                .permitAll();

        return http.build();
    }
}
