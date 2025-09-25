package com.capgemini.jpahibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.capgemini.jpahibernate.entity.BankAccount;
import com.capgemini.jpahibernate.entity.Employee;
import com.capgemini.jpahibernate.util.HibernateUtil;

public class OneToManyTesting {

	public static void main(String[] args) {
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session session =sf.getCurrentSession();
		Transaction t= session.beginTransaction();
		BankAccount acc1= new BankAccount("ACC-01","Savings");
		BankAccount acc2= new BankAccount("ACC-02","Loan");
		List<BankAccount> listBankAcc= new ArrayList<>();
		listBankAcc.add(acc1);
		listBankAcc.add(acc2);
		
		Employee emp= new Employee();
		emp.setEmpName("Jayanta");
		emp.setListAccount(listBankAcc);
		session.persist(emp);
		
		Employee list=session.find(Employee.class, 1);
		
		t.commit();
		
	}

}
