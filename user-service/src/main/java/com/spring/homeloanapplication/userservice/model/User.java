package com.spring.homeloanapplication.userservice.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long savingsAccountNumber;
    private String username;
    private String password;
    private String name;
    private String role;
    private long salary;
}
