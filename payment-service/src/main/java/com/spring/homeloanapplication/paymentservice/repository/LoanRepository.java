package com.spring.homeloanapplication.paymentservice.repository;

import com.spring.homeloanapplication.paymentservice.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan,Long> {
    Loan findByLoanId(long loanId);
    List<Loan> findAllByUserId(long userId);
}
