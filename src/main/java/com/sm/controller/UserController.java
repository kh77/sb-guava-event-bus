package com.sm.controller;

import com.sm.dto.User;
import com.sm.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public User findById(@RequestBody User user) {
        System.out.println("Thread " + Thread.currentThread().getName() + " - User Controller: ");
        return userService.create(user);
    }


}
