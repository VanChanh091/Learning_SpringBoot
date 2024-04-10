package com.iuh.spring.buoi5.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignUpRequest {
    @NotBlank(message = "username is require")
    @Pattern(regexp = "^[a-zA-Z0-9-_]{6,50}", message = "username wrong format")
    private String username;
    private String password;
    @NotBlank(message = "email is require")
    private String email;
}
