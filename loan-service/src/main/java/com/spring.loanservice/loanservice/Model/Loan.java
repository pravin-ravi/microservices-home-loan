package com.spring.loanservice.loanservice.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long loanId;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long loanAccountNumber;
    private long userId;
    private double outstandingBalance;
    private long tenure;
    private double emi;
    private double interestRate = 0.07;

}