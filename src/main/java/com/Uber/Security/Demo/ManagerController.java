package com.Uber.Security.Demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/manager")

public class ManagerController {

    @GetMapping
    public String get() {
        return "Get::Hello Manager!";
    }

    @PostMapping
    public String post() {
        return "Post::Hello Manager!";
    }

    @PutMapping
    public String put () {
        return "Put ::Hello Manager!";
    }

    @DeleteMapping
    public String delete() {
        return "Delete::Hello Manager!";
    }

}