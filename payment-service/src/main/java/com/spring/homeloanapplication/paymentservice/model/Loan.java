package com.spring.homeloanapplication.paymentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
