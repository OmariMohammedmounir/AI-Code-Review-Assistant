package com.example.ai_review.repository;

import com.example.ai_review.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}