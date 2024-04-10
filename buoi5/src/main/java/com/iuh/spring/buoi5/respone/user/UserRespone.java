package com.iuh.spring.buoi5.respone.user;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserRespone {
    private String username;
    private String password;
    private String email;
}
