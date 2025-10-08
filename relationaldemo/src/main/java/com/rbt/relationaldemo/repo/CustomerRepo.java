package com.rbt.relationaldemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rbt.relationaldemo.entity.BankAccount;
import com.rbt.relationaldemo.entity.Customer;
import com.rbt.relationaldemo.entity.UserDetail;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	
	Customer findByUserName(String userName);
 
}