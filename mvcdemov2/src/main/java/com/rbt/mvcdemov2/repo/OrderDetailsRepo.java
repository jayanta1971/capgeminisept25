package com.rbt.mvcdemov2.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rbt.mvcdemov2.entity.OrderDetails;
import com.rbt.mvcdemov2.entity.Payment;
import com.rbt.mvcdemov2.entity.User;
@Repository
public interface OrderDetailsRepo extends JpaRepository<OrderDetails, Integer> {
	@Query("SELECT o.paymentList FROM OrderDetails o WHERE o.orderId = :orderId")
    List<Payment> findPaymentsByOrderId(@Param("orderId") String orderId);

	@Query("SELECT o, p FROM OrderDetails o JOIN FETCH o.paymentList p WHERE o.id = :id")
    List<Object[]> findOrderAndPaymentData(@Param("id") int id);
   
    
    @Query("SELECT o FROM OrderDetails o JOIN FETCH o.paymentList WHERE o.id = :id")
    Optional<OrderDetails> findOrderWithPayments(@Param("id") int id);
    
     
    Optional<OrderDetails> findByOrderId (String orderId);
}
