package com.rbt.relationaldemo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetail {
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	
	@Column(name="user_name")
	String userName;
	
	@OneToMany(mappedBy="userDetail" , cascade=CascadeType.ALL , fetch = FetchType.LAZY)
	List<BankAccount> listAccounts;
	
	

	public UserDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetail(String userName, List<BankAccount> listAccounts) {
		super();
		this.userName = userName;
		this.listAccounts = listAccounts;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<BankAccount> getListAccounts() {
		return listAccounts;
	}

	public void setListAccounts(List<BankAccount> listAccounts) {
		this.listAccounts = listAccounts;
	}

	 

//	@Override
//	public String toString() {
//		return "UserDetails [id=" + id + ", userName=" + userName + ", listAccounts=" + listAccounts + "]";
//	}
	
	
	
	

}
