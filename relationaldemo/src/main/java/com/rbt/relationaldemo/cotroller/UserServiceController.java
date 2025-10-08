package com.rbt.relationaldemo.cotroller;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rbt.relationaldemo.dto.UserDtO;
import com.rbt.relationaldemo.entity.UserDetail;
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
	
	@GetMapping
	void findAll()
	{
		List<UserDtO> list=  userDetailService.findAll();
		for(UserDtO userDetail:list)
		{
			System.out.println(userDetail);
//			userDetail.getListAccounts().size();
//			System.out.println(Hibernate.isInitialized(userDetail.getListAccounts()));
		}
	 
		//System.out.println(userDetailService.fidAll());
		
	}
	
	@GetMapping("/{accType}")
	void findUsersWithAccountType(@PathVariable String accType )
	{
		
	   List<UserDetail> list=userDetailService.findUserDetailsAndBankAccountsByAccountType(accType);
//		System.out.println(userDetailService.findUserDetailsAndBankAccountsByAccountType("CURRENT"));
		
	   for(UserDetail dtl:list)
	   {
		   System.out.println(dtl.getUserName());
	   }
	}
	
	@GetMapping("/byid")
	void findUsersById()
	{
		
		List<UserDetail> list=userDetailService.findUserDetailsByUserId(1);
		for(UserDetail userDetail:list)
		{
			System.out.println(userDetail.getUserName());
		}
		//System.out.println(userDetailService.findUserDetailsByUserId(1).size());
		
	}





}
