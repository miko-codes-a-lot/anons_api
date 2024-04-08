package com.anons.api.controllers;

import com.anons.api.models.dto.UserDTO;
import com.anons.api.models.form.UserLoginForm;
import com.anons.api.models.form.UserRegisterForm;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/secure")
public class SecureController {
    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public String login(@RequestBody UserLoginForm user) {
        System.out.println("User: " + user);
        return "JWT";
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO register(@RequestBody UserRegisterForm user) {
        return UserDTO.builder()
                .id(1L)
                .username(user.getUsername())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .build();
    }
}
