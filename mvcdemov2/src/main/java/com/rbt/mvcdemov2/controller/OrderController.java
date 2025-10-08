package com.rbt.mvcdemov2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rbt.mvcdemov2.entity.OrderDetails;
import com.rbt.mvcdemov2.entity.Payment;
import com.rbt.mvcdemov2.entity.User;
import com.rbt.mvcdemov2.service.OrderService;
import com.rbt.mvcdemov2.service.UserService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping 
	void save(@RequestBody OrderDetails order)
	{
		Payment payment1 = new Payment();
		payment1.setPaymentAmount(1000);
		Payment payment2 = new Payment();
		payment2.setPaymentAmount(2000);
		List<Payment> paymentList= new ArrayList<>();
		paymentList.add(payment1);
		paymentList.add(payment2);
	 
		OrderDetails order1 = new OrderDetails("ORD-01",paymentList);
		for (Payment payment : paymentList) {
		    payment.setOrderDetails(order1);
		}
		orderService.save(order1);
	}
	@GetMapping("/payment/{orderId}")
	List<Payment> findByOrderId(@PathVariable String orderId)
	{
		return orderService.findPaymentsByOrderId(orderId);
		
	}
	
	@GetMapping("/{id}")
	Optional<OrderDetails> findOrderWithPayments(@PathVariable int id)
	{
		//return orderService.findOrderWithPayments(id);
		return orderService.findOrderWithPaymentsAlt(id);
	}
	
	@GetMapping("/ord1/{orderId}")
	Optional<OrderDetails> findByOrderIdV2(@PathVariable String  orderId)
	{
		//return orderService.findOrderWithPayments(id);
		return orderService.findByOrderId(orderId);
	}
	
	 
}
