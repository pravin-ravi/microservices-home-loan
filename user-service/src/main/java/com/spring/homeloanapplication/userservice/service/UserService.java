package com.spring.homeloanapplication.userservice.service;

import com.spring.homeloanapplication.userservice.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public ResponseEntity<List<User>> getAllUsers();

    public ResponseEntity<User> addUser(User user);

    public ResponseEntity<User> loginUser(User user);

    public ResponseEntity<User> getUserById(long userId);

    public ResponseEntity<User> updateUser(User user, long userId);
}
