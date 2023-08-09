package com.spring.homeloanapplication.paymentservice.service;

import com.spring.homeloanapplication.paymentservice.model.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PaymentService {

    public ResponseEntity<Payment> getPaymentById(long paymentId);

    public ResponseEntity<List<Payment>> getPaymentsByUser(long userId);

    public ResponseEntity<Payment> makePayment(Payment payment);
}
