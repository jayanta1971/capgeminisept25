package com.capgemin.designpattern.prototype;

public class Employee implements Prototype {
	
	String accessRight;
	String empId;
	
	
	public Employee(String accessRight, String empId) {
		super();
		this.accessRight = accessRight;
		this.empId = empId;
	}


	public Prototype clone() {
		 return new Employee(accessRight,empId);
	}


	public String getAccessRight() {
		return accessRight;
	}


	public void setAccessRight(String accessRight) {
		this.accessRight = accessRight;
	}


	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	@Override
	public String toString() {
		return "Employee [accessRight=" + accessRight + ", empId=" + empId + "]";
	}

	
	
}
