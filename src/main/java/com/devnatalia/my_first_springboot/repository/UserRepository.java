package com.devnatalia.my_first_springboot.repository;

import com.devnatalia.my_first_springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

}
