package com.iuh.spring.buoi5.controller;

import com.iuh.spring.buoi5.request.SignUpRequest;
import com.iuh.spring.buoi5.respone.WrapRespone;
import com.iuh.spring.buoi5.respone.user.UserRespone;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
@Log4j2
public class UserController {
    @PostMapping("/signup")
    public WrapRespone<UserRespone> signup(@RequestBody @Valid SignUpRequest signupRequest) {
        log.info("signup request: {}", signupRequest);
        UserRespone userRespone = UserRespone.builder()
                .username(signupRequest.getUsername())
                .password(signupRequest.getPassword())
                .email((signupRequest.getEmail()))
                .build();
        return WrapRespone.ok(userRespone);
    }
}
