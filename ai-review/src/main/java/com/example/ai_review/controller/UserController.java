package com.example.ai_review.controller;

import com.example.ai_review.entities.*;

import com.example.ai_review.services.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getAllUsers();
    }
}