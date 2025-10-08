package com.rbt.relationaldemo.entity;

 

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bank_account")
public class BankAccount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	
	@Column(name="account_type")
	String accountType;
	
	@Column(name="account_number")
	String accountNumber;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.DETACH})
	@JoinColumn(name="user_detail_id")
	UserDetail userDetail;
	
	

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(String accountType, String accountNumber, UserDetail userDetail) {
		super();
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.userDetail = userDetail;
	}

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

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", accountType=" + accountType + ", accountNumber=" + accountNumber + "]";
	}

	  

	 
	
	
	
	

}
