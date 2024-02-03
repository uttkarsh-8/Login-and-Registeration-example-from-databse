package com.registerandlogin.registerationandllogging.repository;

import com.registerandlogin.registerationandllogging.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
