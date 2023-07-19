//package com.example.loginproject.config;
//
//import com.example.loginproject.domain.UserRole;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//
////@Configuration
////@EnableWebSecurity
//public class SecurityConfig {
//
////    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http
//                .csrf(AbstractHttpConfigurer::disable)
//                .authorizeHttpRequests( auth -> auth
//                        .requestMatchers("/security-login/info").authenticated()
//                        .requestMatchers("/security-login/admin/**").hasRole(UserRole.ADMIN.name())
//                        .anyRequest().permitAll()
//                )
//                .formLogin( login -> login
//                        .usernameParameter("loginId")
//                        .passwordParameter("password")
//                        .loginPage("/security-login/login")
//                        .defaultSuccessUrl("/security-login")
//                        .failureUrl("/security-login/login")
//                )
//                .logout( logout -> logout
//                        .logoutUrl("/security-login/logout")
//                        .invalidateHttpSession(true).deleteCookies("JSESSIONID")
//                )
//                .build();
//    }
//}
