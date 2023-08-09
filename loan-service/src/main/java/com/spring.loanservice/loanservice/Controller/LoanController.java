package com.spring.loanservice.loanservice.Controller;

import com.spring.loanservice.loanservice.Model.Loan;
import com.spring.loanservice.loanservice.Model.LoanRequest;
import com.spring.loanservice.loanservice.service.LoanRequestService;
import com.spring.loanservice.loanservice.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class LoanController {

    @Autowired
    LoanRequestService loanRequestService;
    @Autowired
    LoanService loanService;

    @GetMapping("/")
    public ResponseEntity<List<Loan>> getLoans(){
        return loanService.getAllLoans();
    }

    @GetMapping("/{loanId}")
    public ResponseEntity<Loan> getLoanById(@PathVariable long loanId){
        return loanService.getLoanById(loanId);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Loan>> getLoansByUser(@PathVariable long userId){
//        return loanService.getLoansByUser(userId);
        return null;
    }

    @GetMapping("loanRequest/")
    public ResponseEntity<List<LoanRequest>> getLoanRequests(){
        return loanRequestService.getAllLoanRequests();
    }

    @GetMapping("loanRequest/{loanRequestId}")
    public ResponseEntity<LoanRequest> getLoanRequestById(@PathVariable long loanRequestId){
        return loanRequestService.getLoanRequestById(loanRequestId);
    }

    @GetMapping("loanRequest/user/{userId}")
    public ResponseEntity<List<LoanRequest>> getLoanRequestsByUser(@PathVariable long userId){
        return loanRequestService.getLoanRequestsByUser(userId);
    }

    @PostMapping("loanRequest/")
    public ResponseEntity<LoanRequest> addLoanRequest(@RequestBody LoanRequest loanRequest){
        return loanRequestService.addLoanRequest(loanRequest);
    }

    @DeleteMapping("loanRequest/{loanRequestId}")
    public void deleteLoanRequest(@PathVariable long loanRequestId){
        loanRequestService.deleteLoanRequest(loanRequestId);
        return;
    }

    @PostMapping("loanRequest/approve/{loanRequestId}")
    public ResponseEntity<LoanRequest> approveLoanRequest(@RequestBody LoanRequest loanRequest, @PathVariable long loanRequestId){
        return loanRequestService.approveLoan(loanRequest, loanRequestId);
    }

    @PostMapping("loanRequest/decline/{loanRequestId}")
    public ResponseEntity<LoanRequest> declineLoanRequest(@PathVariable long loanRequestId){
        return loanRequestService.declineLoan(loanRequestId);
    }

    @PutMapping("loanRequest/{loanRequestId}")
    public ResponseEntity<LoanRequest> editLoanRequest(@RequestBody LoanRequest loanRequest, @PathVariable long loanRequestId){
        return loanRequestService.editLoanRequest(loanRequest, loanRequestId);
    }

}
