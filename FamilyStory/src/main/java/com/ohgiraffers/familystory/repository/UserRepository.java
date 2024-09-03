package com.ohgiraffers.familystory.repository;

import com.ohgiraffers.familystory.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email); // Optional로 변경
}
