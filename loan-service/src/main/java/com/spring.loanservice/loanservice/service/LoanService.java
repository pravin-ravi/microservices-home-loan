package com.spring.loanservice.loanservice.service;

import com.spring.loanservice.loanservice.Model.Loan;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LoanService {

    public ResponseEntity<List<Loan>> getAllLoans();

    public ResponseEntity<Loan> getLoanById(long loanId);

    public ResponseEntity<List<Loan>> getLoansByUser(long userId);
}
