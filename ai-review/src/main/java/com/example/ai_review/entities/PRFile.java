package com.example.ai_review.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pr_files")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PRFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pull_request_id", nullable = false)
    private PullRequest pullRequest;

    @Column(name = "file_path", nullable = false)
    private String filePath;

    private Integer additions = 0;
    private Integer deletions = 0;

    @Lob
    private String changes;

    @OneToMany(mappedBy = "prFile", cascade = CascadeType.ALL)
    private java.util.List<AIAnalysis> aiAnalyses;
}