package com.uzrnem.testing.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.uzrnem.testing.model.User;
import com.uzrnem.testing.service.UserService;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    User user;

    @BeforeEach
    void setUp() {
        user = new User(1,"Bhagyesh");
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testGetAllCloudVendors() {
        when(userService.getAll()).thenReturn(
            Stream.of(user).collect(Collectors.toCollection(ArrayList::new)));

        assertEquals(userController.list().get(0).getName(),user.getName());
    }
}