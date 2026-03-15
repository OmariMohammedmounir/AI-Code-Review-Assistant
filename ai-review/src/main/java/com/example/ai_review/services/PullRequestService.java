package com.example.ai_review.services;

import com.example.ai_review.entities.*;

import com.example.ai_review.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PullRequestService {

    private final PullRequestRepository pullRequestRepository;

    public PullRequestService(PullRequestRepository pullRequestRepository) {
        this.pullRequestRepository = pullRequestRepository;
    }

    public PullRequest savePullRequest(PullRequest pullRequest){
        return pullRequestRepository.save(pullRequest);
    }

    public List<PullRequest> getAllPullRequests(){
        return pullRequestRepository.findAll();
    }

    public PullRequest getPullRequest(Long id){
        return pullRequestRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pull request not found"));
    }
}