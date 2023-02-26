package com.example.had.repository;

import com.example.had.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface userRepository extends JpaRepository<User, UUID> {
}
