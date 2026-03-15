package com.example.ai_review.entities;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "pull_requests")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PullRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "repository_id", nullable = false)
    private Repository repository;

    @Column(name = "pr_number", nullable = false)
    private Integer prNumber;

    private String title;

    private String author;

    @Enumerated(EnumType.STRING)
    private Status status = Status.OPEN;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "pullRequest", cascade = CascadeType.ALL)
    private List<PRFile> prFiles;

    public enum Status {
        OPEN, CLOSED, MERGED
    }

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}