package com.rbt.mvcdemov2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbt.mvcdemov2.entity.User;
import com.rbt.mvcdemov2.repo.UserRepo;
import com.rbt.mvcdemov2.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
	}

}
