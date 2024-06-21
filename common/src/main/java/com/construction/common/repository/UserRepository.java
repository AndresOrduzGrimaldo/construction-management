package com.construction.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.construction.common.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
