package com.example.had.repository;

import com.example.had.entity.Doctor;
import com.example.had.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface doctorRepository extends JpaRepository<Doctor, UUID> {
    @Query("select d from Doctor d where d.userList = ?1")
    List<Doctor> findByUserList(User userList);
    @Query("select d from Doctor d where d.isVerified = ?1")
    List<Doctor> findByIsVerified(boolean isVerified);
    @Transactional
    @Modifying
    @Query("update Doctor d set d.isVerified = ?1 where upper(d.email) = upper(?2)")
    int updateIsVerifiedByEmailIgnoreCase(boolean isVerified, @NonNull String email);
    Doctor findByEmail(String email);
}
