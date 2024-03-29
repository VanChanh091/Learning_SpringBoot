package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.ListUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("demo")
public class TestController {
    private List<User> users = new ArrayList<>();

    @GetMapping("/")
    public List<User> get() {
        return users;
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> getUser() {
        users.add(new User(1, "Chanh"));
        users.add(new User(2, "Ngan"));
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") int id) {
        return new ResponseEntity<>(users.get(id), HttpStatus.OK);
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        users.add(user);
        return user;
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") int id, @RequestParam String name) {
        if (users.contains(id)) {
            User user = users.get(id);
            user.setName(name);
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

//    @PutMapping("/user/{id}")
//    public User editUser(@PathVariable("id") int id, String name){
//        users.get(id).setName(name);
//        return users.get(id);
//    }

    public List<User> searchUser(@RequestParam String name) {
        List<User> users1 = users.stream()
                .filter((user) -> user.getName().contains(name))
                .collect(Collectors.toList());
        return users1;
    }
}
