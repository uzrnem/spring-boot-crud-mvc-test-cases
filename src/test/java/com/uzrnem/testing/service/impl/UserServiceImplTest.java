package com.uzrnem.testing.service.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.uzrnem.testing.model.User;
import com.uzrnem.testing.repository.UserRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    User user;

    @BeforeEach
    void setUp() {
        user = new User(1,"Bhagyesh");
    }

    @AfterEach
    void tearDown() throws Exception {}

    @Test
    void testGetAll() {
        when(userRepository.findAll()).thenReturn(
            Stream.of(user).collect(Collectors.toCollection(ArrayList::new)));

        assertEquals(userService.getAll().get(0).getName(),user.getName());
    }
}