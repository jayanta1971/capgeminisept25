package com.rbt.mvcdemov2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.rbt.mvcdemov2.entity.OrderDetails;
import com.rbt.mvcdemov2.entity.Payment;
import com.rbt.mvcdemov2.entity.User;

public interface OrderService {
	
	List<OrderDetails> findAll();
	void save(OrderDetails orderDetails);
	List<Payment> findPaymentsByOrderId( String orderId);
	Optional<OrderDetails> findOrderWithPayments(int id);
	public  Optional<OrderDetails>  findOrderWithPaymentsAlt(int id);
	 Optional<OrderDetails> findByOrderId (String orderId);
}
