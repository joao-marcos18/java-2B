package com.example.spring_security.repositories;

import com.example.spring_security.models.UserModel;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    UserDetails findByLogin(String role);
}
