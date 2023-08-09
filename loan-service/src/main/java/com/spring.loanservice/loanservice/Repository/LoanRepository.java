package com.spring.loanservice.loanservice.Repository;

import com.spring.loanservice.loanservice.Model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan,Long> {

    Loan findByLoanId(long loanId);
    List<Loan> findAllByUserId(long userId);
}
