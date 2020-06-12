package com.ankit.payment.api.repository;

import com.ankit.payment.api.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    Payment findByOrderId(Integer orderId);
}
