package com.rbt.relationaldemo.dto;

import java.util.List;

import com.rbt.relationaldemo.entity.BankAccount;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class UserDtO {
	
	 
	int id; 
	String userName; 
	List<BankAccountDto> listAccounts;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	 
	public List<BankAccountDto> getListAccounts() {
		return listAccounts;
	}
	public void setListAccounts(List<BankAccountDto> listAccounts) {
		this.listAccounts = listAccounts;
	}
	@Override
	public String toString() {
		return "UserDtO [id=" + id + ", userName=" + userName + ", listAccounts=" + listAccounts + "]";
	}
	public UserDtO(int id, String userName, List<BankAccountDto> listAccounts) {
		super();
		this.id = id;
		this.userName = userName;
		this.listAccounts = listAccounts;
	}
	public UserDtO(String userName, List<BankAccountDto> listAccounts) {
		super();
		this.userName = userName;
		this.listAccounts = listAccounts;
	}
	public UserDtO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
