package com.uzrnem.testing.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.uzrnem.testing.model.User;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class UserRepositoryTest {

    
    @Autowired
    private UserRepository userRepository;
    User user;

    @BeforeEach
    void setUp() {
        user = new User(1,"Bhagyesh");
        userRepository.save(user);
    }

    @Test
    void testFindAll() {
        List<User> user = userRepository.findAll();
        assertThat(user.get(0).getId()).isEqualTo(1);
    }
}
