package com.rbt.mvcdemov2.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="order_details")
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="order_id")
	String orderId;
	
	@OneToMany(mappedBy="orderDetails" ,cascade=CascadeType.ALL)
	List<Payment> paymentList;

	public OrderDetails(String orderId, List<Payment> paymentList) {
		super();
		this.orderId = orderId;
		this.paymentList = paymentList;
	}

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", orderId=" + orderId + ", paymentList=" + paymentList + "]";
	} 

	public void setPaymentList(List<Payment> paymentList) {
	    this.paymentList = paymentList;
	    for (Payment payment : paymentList) {
	        payment.setOrderDetails(this);
	    }
	}
 
}
