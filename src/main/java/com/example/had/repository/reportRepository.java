package com.example.had.repository;

import com.example.had.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface reportRepository extends JpaRepository<Report, UUID> {
}
