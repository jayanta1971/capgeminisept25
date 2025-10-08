package com.rbt.relationaldemo.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.rbt.relationaldemo.dto.UserDtO;
import com.rbt.relationaldemo.entity.BankAccount;
import com.rbt.relationaldemo.entity.UserDetail;

public interface UserDetailService {
	
    void save(UserDtO userDetail);
//    List<UserDetail> findAll();
    List<UserDtO> findAll();
    List<UserDetail> findUserDetailsAndBankAccountsByAccountType(String accType);
	public List<UserDetail> findUserDetailsByUserId(int id);
}
