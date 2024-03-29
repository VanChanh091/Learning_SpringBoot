package com.iuh.spring.buoi4.service;

import com.iuh.spring.buoi4.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserService {
    public List<User> getUser();
    public User postUser(@RequestBody User user);
}
