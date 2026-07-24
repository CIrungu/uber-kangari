package com.Uber.Security.Demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @GetMapping
    public String get() {
        return "Get::Hello Admin!";
    }

    @PostMapping
    public String post() {
        return "Post::Hello Admin!";
    }

    @PutMapping
    public String put () {
        return "Put ::Hello Admin!";
    }

    @DeleteMapping
    public String delete() {
        return "Delete::Hello Admin!";
    }

}
