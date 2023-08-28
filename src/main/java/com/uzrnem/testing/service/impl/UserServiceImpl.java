package com.uzrnem.testing.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uzrnem.testing.model.User;
import com.uzrnem.testing.repository.UserRepository;
import com.uzrnem.testing.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAll()
    {
        return userRepository.findAll();
    }

    @Override
    public void save(User u) {
        userRepository.save(u);
    }
}
