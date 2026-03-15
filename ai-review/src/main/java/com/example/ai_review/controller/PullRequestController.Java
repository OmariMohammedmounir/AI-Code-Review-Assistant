package com.example.ai_review.controller;

import com.example.ai_review.entities.*;

import com.example.ai_review.services.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pullrequests")
public class PullRequestController {

    private final PullRequestService pullRequestService;

    public PullRequestController(PullRequestService pullRequestService) {
        this.pullRequestService = pullRequestService;
    }

    @PostMapping
    public PullRequest createPR(@RequestBody PullRequest pr){
        return pullRequestService.savePullRequest(pr);
    }

    @GetMapping
    public List<PullRequest> getPRs(){
        return pullRequestService.getAllPullRequests();
    }
}