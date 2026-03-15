package com.example.ai_review.entities;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "code_metrics")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CodeMetrics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pull_request_id", nullable = false)
    private PullRequest pullRequest;

    private Integer linesChanged = 0;
    private Float codeComplexity = 0f;
    private Float vulnerabilityScore = 0f;
    private Float technicalDebtScore = 0f;

    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}