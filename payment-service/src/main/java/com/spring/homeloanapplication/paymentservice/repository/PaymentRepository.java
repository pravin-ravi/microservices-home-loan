package com.spring.homeloanapplication.paymentservice.repository;

import com.spring.homeloanapplication.paymentservice.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository  extends JpaRepository<Payment,Long> {

    Payment findByPaymentId(long paymentId);

    List<Payment> findAllByUserId(long userId);
}
