package com.example.had.repository;

import com.example.had.entity.PrepopulatedArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface PrepopulatedArticleRepository extends JpaRepository<PrepopulatedArticle, UUID> {
}
