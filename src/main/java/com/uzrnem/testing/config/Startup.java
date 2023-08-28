package com.uzrnem.testing.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.uzrnem.testing.model.User;
import com.uzrnem.testing.service.UserService;

import jakarta.annotation.PostConstruct;

@Component
public class Startup {

    @Autowired
    UserService userService;

    @PostConstruct
    public void init(){
        userService.save(new User(null, "Bhagyesh"));
    }
}