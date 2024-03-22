package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.ListUser;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {
    private ListUser listUser;

//    public TestController(ListUser listUser) {
//        this.listUser = listUser;
//    }

    @GetMapping("/user")
    public List<User> getUsers(){
        listUser = new ListUser();
        return listUser.userList();
    }

}
