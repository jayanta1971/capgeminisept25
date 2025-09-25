package com.capgemin.designpattern.prototype.test;

import com.capgemin.designpattern.prototype.Employee;

public class ProtoTypeTest {

	public static void main(String[] args) {
		 
		
		Employee emp1 = new Employee ("General","E01");
		System.out.println(emp1);
		Employee emp2=(Employee)emp1.clone();
		emp2.setEmpId("E02");
		System.out.println(emp2);
	}

}
