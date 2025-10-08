package com.rbt.springsecv2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.rbt.springsecv2.entity.UserEntity;
import com.rbt.springsecv2.repo.UserEntityRepo;

@Service
public class CustomUserService implements UserDetailsService {
	
	@Autowired
	UserEntityRepo userEntityRepo;
	
	@Autowired
	PasswordEncoder passWordEncoder;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		 UserEntity userEntity = userEntityRepo.findByUserName(username)
	                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

	        return new org.springframework.security.core.userdetails.User(
	                userEntity.getUsername(),
	                userEntity.getPassword(),
	                getAuthorities(userEntity.getRoles())
	        );
		
 
	}
	
	  private List<GrantedAuthority> getAuthorities(List<String> roles) {
	        List<GrantedAuthority> authorities = new ArrayList<>();
	        for (String role : roles) {
	            authorities.add(new SimpleGrantedAuthority(role));
	        }
	        return authorities;
	    }

	    public void saveUser(UserEntity userEntity) {
	        userEntity.setPassword(passWordEncoder.encode(userEntity.getPassword()));
	        userEntityRepo.save(userEntity);
	    }
	    
	    public UserEntity getData(int id)
	    {
	    	
	    	return userEntityRepo.findById(id).get();
	    }

}
