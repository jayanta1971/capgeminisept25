package com.rbt.relationaldemo.security;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 

import com.rbt.relationaldemo.service.impl.CustomUserDetailsService;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig {

//    @SuppressWarnings("removal")
//	@Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//    	http
//        .authorizeHttpRequests(authorize -> authorize
//            .requestMatchers("/login", "/login/**","/swagger-ui/**").permitAll()
//            .anyRequest().authenticated()
//        )
////        .formLogin(form -> form
////            .loginPage("/login")
////            .defaultSuccessUrl("/home", true) // Change /home to your actual home page URL
////            .permitAll()
////        ).
//        .formLogin(form -> {});
////        .logout(logout -> logout.permitAll());
//    	
//    	 
//        return http.build();
//    }
//
////    @Bean
////    public UserDetailsService userDetailsService() {
////        return new CustomUserDetailsService(); // Your custom UserDetailsService
////    }
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user = User.withDefaultPasswordEncoder()
//                .username("user")
//                .password("password")
//                .roles("USER")
//                .build();
//        return new InMemoryUserDetailsManager(Collections.singleton(user));
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}
