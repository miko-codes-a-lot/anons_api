package com.anons.api.controllers;

import com.anons.api.models.form.UserLoginForm;
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
}
