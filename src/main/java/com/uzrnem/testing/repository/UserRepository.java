package com.uzrnem.testing.repository;

import com.uzrnem.testing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User save(User user);

    List<User> findAll();
}
