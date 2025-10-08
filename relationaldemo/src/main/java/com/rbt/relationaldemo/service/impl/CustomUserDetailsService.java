package com.rbt.relationaldemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.stereotype.Service;

import com.rbt.relationaldemo.entity.Customer;
import com.rbt.relationaldemo.repo.CustomerRepo;

@Service
public class CustomUserDetailsService   {

//    @Autowired
//    private CustomerRepo customerRepository; // Your JPA repository for User entity
//
//    @Override
//    public UserDetails loadUserByUsername(String username)  {
//    	System.out.println("-loadUserByUsername--");
//        Customer user = customerRepository.findByUserName(username);
//            
//        
//        // Map your User entity to Spring Security's UserDetails
//        return new org.springframework.security.core.userdetails.User(
//            user.getUserName(),
//            user.getUserPassword(),
//            null
//           // user.getAuthorities() // Convert your roles to GrantedAuthority
//        );
//    }
}