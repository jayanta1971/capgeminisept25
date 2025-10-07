package com.rbt.relationaldemo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbt.relationaldemo.dto.BankAccountDto;
import com.rbt.relationaldemo.dto.UserDtO;
import com.rbt.relationaldemo.entity.BankAccount;
import com.rbt.relationaldemo.entity.UserDetail;
import com.rbt.relationaldemo.repo.UserDetailRepo;
import com.rbt.relationaldemo.service.UserDetailService;
@Service
public class UserDetailImpl implements UserDetailService {

	@Autowired
	UserDetailRepo userDetailRepo;
	
	@Override
	public void save(UserDtO userDto) {
		// TODO Auto-generated method stub
//		userDetailRepo.save(userDetail);
		
		UserDetail userDetail= new UserDetail();
		userDetail.setUserName(userDto.getUserName());
		List<UserDetail> listUserDetail= new ArrayList<>(); 
		List<BankAccount> listAcc= new ArrayList<>();
		List<BankAccountDto> bnkAccountList=userDto.getListAccounts();
		for(BankAccountDto account:bnkAccountList)
		{
			BankAccount bnkAccount= new BankAccount();
			bnkAccount.setAccountNumber(account.getAccountNumber());
			bnkAccount.setAccountType(account.getAccountType());
			bnkAccount.setUserDetail(userDetail);
			listAcc.add(bnkAccount);
			
			
		}
		userDetail.setListAccounts(listAcc);
		userDetailRepo.save(userDetail);
		
		
		
		
	}

}
