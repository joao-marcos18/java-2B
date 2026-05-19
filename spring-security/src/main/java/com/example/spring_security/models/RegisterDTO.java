package com.example.spring_security.models;

import com.example.spring_security.Enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
