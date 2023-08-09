package com.spring.loanservice.loanservice.Repository;

import com.spring.loanservice.loanservice.Model.LoanRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRequestRepository extends JpaRepository<LoanRequest,Long> {

    LoanRequest findByLoanRequestId(long loanRequestId);
    List<LoanRequest> findAllByUserId(long userId);
}
