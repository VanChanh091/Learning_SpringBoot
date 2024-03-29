package com.iuh.spring.buoi4.service;

import com.iuh.spring.buoi4.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements  UserService{

    private List<User> users = new ArrayList<>();

    @Override
    public List<User> getUser() {
        return users;
    }

    @Override
    public User postUser(User user) {
        users.add(user);
        return user;
    }
}
