package com.example.ai_review.controller;

import com.example.ai_review.entities.*;

import com.example.ai_review.services.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/repositories")
public class RepositoryController {

    private final RepositoryService repositoryService;

    public RepositoryController(RepositoryService repositoryService) {
        this.repositoryService = repositoryService;
    }

    @PostMapping
    public Repository saveRepository(@RequestBody Repository repository){
        return repositoryService.saveRepository(repository);
    }

    @GetMapping
    public List<Repository> getRepositories(){
        return repositoryService.getAllRepositories();
    }
}