package com.spring.loanservice.loanservice.service;

import com.spring.loanservice.loanservice.Model.Loan;
import com.spring.loanservice.loanservice.Repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class LoanServiceImpl implements  LoanService{
    @Autowired
    LoanRepository loanRepo;

    public ResponseEntity<List<Loan>> getAllLoans(){
        List<Loan> loanList = loanRepo.findAll();
        return new ResponseEntity<>(loanList, HttpStatus.OK);
    }

    public ResponseEntity<Loan> getLoanById(long loanId){
        Loan loan = loanRepo.findByLoanId(loanId);
        return new ResponseEntity<>(loan, HttpStatus.OK);
    }

    public ResponseEntity<List<Loan>> getLoansByUser(long userId){
        List<Loan> loanList = loanRepo.findAllByUserId(userId);
        return new ResponseEntity<>(loanList, HttpStatus.OK);
    }
}
