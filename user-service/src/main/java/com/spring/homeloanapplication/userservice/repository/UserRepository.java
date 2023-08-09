package com.spring.homeloanapplication.userservice.repository;

import com.spring.homeloanapplication.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserId(long userId);
}
