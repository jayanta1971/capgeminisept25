package com.rbt.relationaldemo.dto;

import com.rbt.relationaldemo.entity.UserDetail;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class BankAccountDto {
	 
	int id;	 
	String accountType; 
	String accountNumber;
	UserDtO userDetail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public UserDtO getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(UserDtO userDetail) {
		this.userDetail = userDetail;
	}
	public BankAccountDto(int id, String accountType, String accountNumber, UserDtO userDetail) {
		super();
		this.id = id;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.userDetail = userDetail;
	}
	public BankAccountDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccountDto(String accountType, String accountNumber, UserDtO userDetail) {
		super();
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.userDetail = userDetail;
	}
	@Override
	public String toString() {
		return "BankAccountDto [id=" + id + ", accountType=" + accountType + ", accountNumber=" + accountNumber
				+ ", userDetail=" + userDetail + "]";
	}
	
	
	
}
