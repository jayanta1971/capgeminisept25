package com.rbt.mvcdemov2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbt.mvcdemov2.entity.OrderDetails;
import com.rbt.mvcdemov2.entity.Payment;
import com.rbt.mvcdemov2.entity.User;
import com.rbt.mvcdemov2.repo.OrderDetailsRepo;
import com.rbt.mvcdemov2.repo.UserRepo;
import com.rbt.mvcdemov2.service.OrderService;
import com.rbt.mvcdemov2.service.UserService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDetailsRepo orderDetailsRepo;
	
	 
	@Override
	public void save(OrderDetails orderDetails) {
		// TODO Auto-generated method stub
		orderDetailsRepo.save(orderDetails);
	}
	
	@Override
	public List<OrderDetails> findAll() {
		// TODO Auto-generated method stub
		return orderDetailsRepo.findAll();
	}

	@Override
	public List<Payment> findPaymentsByOrderId(String orderId) {
		// TODO Auto-generated method stub
		return orderDetailsRepo.findPaymentsByOrderId(orderId);
	}

	@Override
	public Optional<OrderDetails> findOrderWithPayments(int id) {
		// TODO Auto-generated method stub
		System.out.println("id="+id);
		return orderDetailsRepo.findOrderWithPayments(id);
	}
	
	@Override
	public  Optional<OrderDetails>  findOrderWithPaymentsAlt(int id) {
		// TODO Auto-generated method stub
	 
		return orderDetailsRepo.findById(id);
	}

	@Override
	public Optional<OrderDetails> findByOrderId(String orderId) {
		// TODO Auto-generated method stub
		return orderDetailsRepo.findByOrderId(orderId);
	}


	 

	 
}
