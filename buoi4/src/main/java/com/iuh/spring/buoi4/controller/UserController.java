package com.iuh.spring.buoi4.controller;

import com.iuh.spring.buoi4.entity.User;
import com.iuh.spring.buoi4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<User>> getUser(){
        return new ResponseEntity<>(userService.getUser(), HttpStatus.OK);
    }

    @PostMapping("/")
    public User postUser(@RequestBody User user) {
        return userService.postUser(user);
    }
}
