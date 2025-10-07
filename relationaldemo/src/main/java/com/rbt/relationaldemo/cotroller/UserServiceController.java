package com.rbt.relationaldemo.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rbt.relationaldemo.dto.UserDtO;
import com.rbt.relationaldemo.service.UserDetailService;

@RestController
@RequestMapping("/user")
public class UserServiceController {
	
	@Autowired
	UserDetailService userDetailService;
	
	@PostMapping
	void save(@RequestBody UserDtO userDto)
	{
		
		userDetailService.save(userDto);
		System.out.println(userDto);
		
	}


}
