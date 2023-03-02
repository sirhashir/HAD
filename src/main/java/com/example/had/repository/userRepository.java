package com.example.had.repository;

import com.example.had.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface userRepository extends JpaRepository<User, UUID> {
    @Query("select u from User u where u.doctor.id = ?1")
    List<User> findByDoctor_Id(UUID id);

    @Override
    Optional<User> findById(UUID uuid);
}
