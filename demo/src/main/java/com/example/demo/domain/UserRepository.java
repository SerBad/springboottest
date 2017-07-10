package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhou on 2017/7/4.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
}