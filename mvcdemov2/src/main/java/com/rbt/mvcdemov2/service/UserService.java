package com.rbt.mvcdemov2.service;

import java.util.List;

import com.rbt.mvcdemov2.entity.User;

public interface UserService {
	
	List<User> findAll();
	void save(User user);

}
