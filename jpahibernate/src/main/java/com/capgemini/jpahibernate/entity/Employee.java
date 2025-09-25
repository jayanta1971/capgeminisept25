package com.capgemini.jpahibernate.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="emp_name")
	String empName;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="emp_id")
	List<BankAccount> listAccount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<BankAccount> getListAccount() {
		return listAccount;
	}

	public void setListAccount(List<BankAccount> listAccount) {
		this.listAccount = listAccount;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", listAccount=" + listAccount + "]";
	}
	

}
