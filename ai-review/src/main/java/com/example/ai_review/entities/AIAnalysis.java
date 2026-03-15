package com.example.ai_review.entities;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ai_analysis")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AIAnalysis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pr_file_id", nullable = false)
    private PRFile prFile;

    private String issueType; 
    @Lob
    private String description;
    @Lob
    private String suggestion;

    @Enumerated(EnumType.STRING)
    private Severity severity = Severity.MEDIUM;

    private LocalDateTime createdAt;

    public enum Severity {
        LOW, MEDIUM, HIGH
    }

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}