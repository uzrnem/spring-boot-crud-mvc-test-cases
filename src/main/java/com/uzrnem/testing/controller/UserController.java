package com.uzrnem.testing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.uzrnem.testing.model.User;
import com.uzrnem.testing.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    UserService userService;

    // Read All Cloud Vendor Details from DB
    @GetMapping()
    public List<User> list()
    {
        return userService.getAll();
    }
}
