package com.rbt.springsecv2.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rbt.springsecv2.entity.UserEntity;

public interface UserEntityRepo extends JpaRepository<UserEntity, Integer> {

	
	 Optional<UserEntity> findByUserName(String username);
}
