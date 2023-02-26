package com.example.had.repository;

import com.example.had.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository("auth")
public interface authRepository extends JpaRepository<Auth, UUID> {
    Auth findFirstByUsernameAndPassword(String username, String password);
    Auth findFirstByUsername(String username);
}
