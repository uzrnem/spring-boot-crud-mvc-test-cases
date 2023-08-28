package com.uzrnem.testing.service;

import java.util.List;

import com.uzrnem.testing.model.User;

public interface UserService {
    public void save(User u);
    public List<User> getAll();
}
