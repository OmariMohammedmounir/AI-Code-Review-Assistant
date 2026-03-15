package com.example.ai_review.repository;

import com.example.ai_review.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PullRequestRepository extends JpaRepository<PullRequest, Long> {}