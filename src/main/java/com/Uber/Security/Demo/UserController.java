package com.Uber.Security.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping
    public String get() {
        return "GET:: user controller";
    }

    @PutMapping
    public String put() {
        return "PUT:: user controller";
    }
}